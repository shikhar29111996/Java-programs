public class Sudoku
{
    public int[] puzzle = new int[81];
    private void makePuzzle(int[] puzzle, int i)
    {
        for (int x = 1; x< 10 ; x++)
        {
            puzzle[i]=x;
            if(checkConstraints(puzzle))
            {
                if (i==80)//terminal condition
                {
                    System.out.println(this);//print out the completed puzzle
                        puzzle[i]=0;
                    return;
                }
                else
                    makePuzzle(puzzle,i+1);//find a number for the next square                          
            }
            puzzle[i]=0;//this try didn't work, delete the evidence 
        }       
    }
    private boolean checkConstraints(int[] puzzle)
    {
        int test;
     //test that rows have unique values    
      for (int column=0; column<9; column++)
        {
            for (int row=0; row<9; row++)
            {
                test=puzzle[row+column*9];
                for (int j=0;j<9;j++)
                {
                    if(test!=0&&  row!=j&&test==puzzle[j+column*9])
                        return false;
                }
            }
        }
        //test that columns have unique values
        for  (int column=0; column<9; column++) 
        {
             for(int row=0; row<9; row++)
            {
                test=puzzle[column+row*9];
                for (int j=0;j<9;j++)
                {
                    if(test!=0&&row!=j&&test==puzzle[column+j*9])
                        return false;
                }
            }
        }
        //implement region test here
        int[][] regions = new int[9][9];
        int[] regionIndex ={0,3,6,27,30,33,54,57,60};
        for (int region=0; region<9;region++) //for each region
        {

            int j =0;
            for (int k=regionIndex[region];k<regionIndex[region]+27; k=(k%3==2?k+7:k+1))
                {
                    regions[region][j]=puzzle[k];
                    j++;
                }
        }
        for (int i=0;i<9;i++)//region counter
        {
            for (int j=0;j<9;j++)
            {
                for (int k=0;k<9;k++)
                {
                    if (regions[i][j]!=0&&j!=k&&regions[i][j]==regions[i][k])
                    return false;
                }

            }
        }
    return true;

    }
    public String toString()
    {
        String string= "";
        for (int i=0; i <9;i++)
        {
            for  (int j = 0; j<9;j++)
            {
                string = string+puzzle[i*9+j];
            }
            string =string +"\n";
        }
        return string;
    }
    public static void main(String[] args)
    {
        Sudoku sudoku=new Sudoku();
        sudoku.makePuzzle(sudoku.puzzle, 0);
    }

}