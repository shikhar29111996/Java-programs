import java.io.*;
class spiral_matrix_2
{
  public static void main(String args[])throws IOException 
  {
     BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enetr the no.of rows and colums of a square Matrix less than 10");
     int n=Integer.parseInt(dr.readLine());
     int[][] s=new int[n][n];
 
     int numConcentricSquares=(int)Math.ceil((n)/2.0);
 
     int j,i,sideLen=n,currNum=n*n;

     for(i=0;i<numConcentricSquares;i++)
     {
       // do top side
       for(j=0;j<sideLen;j++)
       {
         s[i][i+j]=currNum--;
       }
 
       // do right side
       for(j=1;j<sideLen;j++)
       {
         s[i+j][n-1-i]=currNum--;
       }
 
       // do bottom side
       for(j=sideLen-2;j>-1;j--)
       {
        s[n-1-i][i+j]=currNum--;
       }
 
       // do left side
       for(j=sideLen-2;j>0;j--) 
       {
         s[i+j][i]=currNum--;
       }
 
       sideLen-=2;
     }
 
      for(i=0;i<n;i++)
      {
          for(j=0;j<n;j++)
          {
              if(s[i][j]<10)
              System.out.print("0"+s[i][j]+" ");
              else
              System.out.print(s[i][j]+" ");
            }
          System.out.println();
      }
    }
  }