 
import java.util.*;
import java.awt.Point;    // we use Point they are useful to carry 2 int

/*
 *  produce a Sudoku grid 
 *  @author: Paul-benoit Larochelle
 */
public class SudokuGenerator {

	// the grid with the numbers
	private int[][] grid;
	// random and array list
	private Random ran;
	private ArrayList<Integer> al;
	// number of row and column in a region
	private int size;
	private int regionSize;

	// size of the Sudoku grid is received as parameter
	// actually not the size of the grid but the size of the region
	SudokuGenerator(int size) {
		regionSize = size;
		this.size = size * size;
		// random number generator
		ran = new Random();
		// arraylist that will contain the possible values for every case in the grid
		al = new ArrayList<Integer>();

	}
	// call to generate a new grid
    public void generate(boolean traceOn) {
    	// start by row 0
    	int currentRow = 0;
    	// to count the startOver
    	int[] trials = new int[size];
		// this this the grid that we will fill
		grid = new int[size][size];
		// now let's fill the grid row by row
		while(currentRow < size) {
			trials[currentRow]++;
			// try to generate the row if it works pass to next roow
			if(genRow(currentRow)) {
				if(traceOn) {
					System.out.print("Row " + (currentRow+1) + " generated after " + trials[currentRow] + " trial");
					if(trials[currentRow] > 1)
						System.out.print("s");
					System.out.println(".");
				}
				currentRow++;
				continue;
			}
			// so it didn't work check our count
			if(trials[currentRow] < regionSize * regionSize * regionSize * 2) {
				continue;
			}
			// so despite all our effort it does not fit we will have to restart for the whole
			// row regions
			if(traceOn) 
				System.out.print("Quitting for row: " + (currentRow+1));
			while(currentRow % regionSize != 0) {
				trials[currentRow--] = 0;
			}
			trials[currentRow] = 0;
			if(traceOn)
				System.out.println(". Starting over with row: "  + (currentRow+1) + ".");
		}
		// ok our grid is filled with 0-size but sudoku grids do not have 0
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				grid[i][j]++;
			}
		}
    }

    // try to generate an return true if it worked
    // (it might be impossible to fill the row for example if the only element left in the row
    //  is 5 so the last column must be 5 but I may already have a 5 in the column or region)
    private boolean genRow(int row) {
    	// for every column in the row
    	for(int col = 0; col < size; col++) {
    		// fill the arrayList of available value if no value abort
    		if(fillArrayList(row, col) == 0) {
    			return false;
    		}
    		// ok I can retrieve a random value from the arrayList
    		grid[row][col] = al.remove(ran.nextInt(al.size()));
    	}
    	return true;
    }
	// fill the ArrayList with all available number for that row,col
	// returns the number of elements in the arraylist
	private int fillArrayList(int row, int col) {
		boolean[] available = new boolean[size];
		// flag all the slot as available
		for(int i = 0; i < size; i++)
			available[i] = true;
		
		// remove the number already used in row
		for(int i = 0; i < row; i++)
			available[grid[i][col]] = false;
		// remove the number already used in col
		for(int i = 0; i < col; i++)
			available[grid[row][i]] = false;
		// now the region. I just have to take care of the row over me in
		// the region the columns to the left of my position have already been checked as unavailable
		Point rowRange = getRegionRowsOrCols(row);
		Point colRange = getRegionRowsOrCols(col);
		for(int i = rowRange.x; i < row; i++) {
			for(int j = colRange.x; j <= colRange.y; j++) {
				available[grid[i][j]] = false;
			}
		}
		
		// empty the arrayList
		al.clear();
		// fill it with all still available numbers
		for(int i = 0; i < size; i++) {
			if(available[i])
				al.add(i);
		}
		return al.size();
	}
    // return the first and last row/column of the region into which is located the (row or col)
    private Point getRegionRowsOrCols(int rowOrCol) {
    	int x = (rowOrCol / regionSize) * regionSize;
    	int y = x + regionSize - 1;
    	Point point = new Point(x,y);
    	return point;
    }
	
	
	// to retrieve the grid
	public int[][] getGrid() {
		return grid;
	}
	
	// to print the grid 
	public String toString() {
        // line to separate the region we build it in a StringBuffer
		StringBuffer buffer = new StringBuffer(size * size * size);
		buffer.append('+');
		for(int i = 0; i < size * 2 + size - 2; i++) {
			buffer.append('-');
		}
		// if I use 2 digits to represent the number
		if(size >= 16) {
			for(int i = 0; i < regionSize * 2 + 4; i++)
				buffer.append('-');
		}
		buffer.append('+');
		// saved in a String
		String dash = new String(buffer);

		// and we continue with the numbers
		buffer.append("\n|");
		for(int i = 0; i < size; i++) {        // for every row
			for(int j = 0; j < size; j++) {    // and column
				// depending of the size of the display
				// we may have to pad with spaces
				if(size >= 16)
				{
					if(grid[i][j] < 16)
						buffer.append(' ');
				}
				buffer.append(' ');
				buffer.append(Integer.toHexString((grid[i][j])).toUpperCase()); // add value to String

				// add a | to separate the regions
				if(j % regionSize == regionSize - 1)
					buffer.append(" | ");
			}
			// add a serie of dash every region
			if(i % regionSize == regionSize -1) {
				buffer.append('\n').append(dash);
			}
			buffer.append('\n');
			// add a | but if it is the last one
			if(i < size -1)
				buffer.append('|');
		}
		return new String(buffer);
	}
    
	public static void main(String[] arg) {
		SudokuGenerator s = new SudokuGenerator(3);
		s.generate(true);
		System.out.print(s);
	}
}
