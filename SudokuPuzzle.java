import java.util.Random;


public class SudokuPuzzle
{
    public int[][] puzzle = new int[9][9];        
    public int[][] solved_puzzle = new int[9][9];

    private int[][] _tmp_grid = new int[9][9];
    private Random rand = new Random();
    private short solution_count;

    public SudokuPuzzle()
    {
        generateSolvedPuzzle(0);
        generatePuzzle();
    }

    private boolean generateSolvedPuzzle(int cur_cell)
    {
        if (cur_cell > 80)
            return true;

        int col = cur_cell % 9;
        int row = cur_cell / 9;

  
        int [] numbers = new int[9];
        for (int i=0; i < 9; i++)
            numbers[i] = 1+i;
            
        shuffle_array(numbers);

        for (int i=0; i < 9; i++)
        {
            int n = numbers[i]; 
       
            if (!existsInColumn(solved_puzzle, n, col)&& !existsInRow(solved_puzzle, n, row)&& !existsInSubGrid(solved_puzzle, n, row, col))
            {
           
                solved_puzzle[row][col] = n;
                if (generateSolvedPuzzle(cur_cell + 1))
                    return true;
                solved_puzzle[row][col] = 0; 
            }
        }
        return false;
    }


    private boolean _solvePuzzle(int cur_cell)
    {
        if (cur_cell > 80)
        {
            solution_count++;
            if (solution_count > 1)
                return true;
            return false;
        }

        int col = cur_cell % 9;
        int row = cur_cell / 9;

        if (_tmp_grid[row][col] == 0)
        {
            for (int n=1; n <= 9; n++)
            {
           
                if (!existsInColumn(_tmp_grid, n, col)&& !existsInRow(_tmp_grid, n, row)&& !existsInSubGrid(_tmp_grid, n, row, col))
                {
               
                    _tmp_grid[row][col] = n;
                    if (_solvePuzzle(cur_cell + 1))
                        return true; 
                    _tmp_grid[row][col] = 0;
                }
            }
        }
        else
        if (_solvePuzzle(cur_cell + 1))
            return true;
        return false;
    }

    private void shuffle_array(int array[])
    {
  
        for (int i = 0; i < array.length; i++)
        {
  
            int j = i + rand.nextInt(array.length - i);
            int t = array[j];
            array[j] = array[i];
            array[i] = t;
        }
    }


    private boolean existsInColumn(int[][] puzzle, int number, int col)
    {
        for (int row = 0; row < 9; row++)
            if (puzzle[row][col] == number)
            return true;
        return false;
    }


    private boolean existsInRow(int[][] puzzle, int number, int row)
    {
        for (int col = 0; col < 9; col++)
            if (puzzle[row][col] == number)
                return true;
        return false;
    }


    private boolean existsInSubGrid(int[][] puzzle, int number, int row, int col)
    {
        int sub_grid_start_row = (row / 3)*3;
        int sub_grid_start_col = (col / 3)*3;
        for (int _row = sub_grid_start_row; _row < sub_grid_start_row + 3; _row++)
            for (int _col = sub_grid_start_col; _col < sub_grid_start_col + 3; _col++)
                if (puzzle[_row][_col] == number)
                    return true;
        return false;
    }
    
    private void generatePuzzle()
    {
  
        for (int row = 0; row < 9; row++)
            for (int col = 0; col < 9; col++)
                puzzle[row][col] = solved_puzzle[row][col];
    
   
        int [] cell_sequence = new int[81];
        for (int i=0; i < 81; i++)
            cell_sequence[i] = i;
        shuffle_array(cell_sequence);

   
        int count_set_to_zero = 0;
        for (int i=0; i < 81 && count_set_to_zero < 64; i++)
        {
            int cur_cell = cell_sequence[i];
            int col = cur_cell % 9;
            int row = cur_cell / 9;
            int sav = puzzle[row][col];
            puzzle[row][col] = 0;
            solution_count = 0;

      
            for (int r = 0; r < 9; r++)
                for (int c = 0; c < 9; c++)
                    _tmp_grid[r][c] = puzzle[r][c];

            if (_solvePuzzle(0)) 
                puzzle[row][col] = sav;
            else
                count_set_to_zero++;
        }
    }

    public void showSolution()
    {
        for (int row = 0; row < 9; row++)
        {
            System.out.print("  ");
            for (int col = 0; col < 9; col++)
                System.out.print(" " + solved_puzzle[row][col]);
            System.out.println();
        }
    }

    public void show()
    {
        for (int row = 0; row < 9; row++)
        {
            System.out.print("  ");
            for (int col = 0; col < 9; col++)
                System.out.print(" " + puzzle[row][col]);
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        SudokuPuzzle sudoku_puzzle = new SudokuPuzzle();
        System.out.println("Puzzle:");
        sudoku_puzzle.show();
        System.out.println();
        System.out.println("Solution:");
        sudoku_puzzle.showSolution();
    }
}