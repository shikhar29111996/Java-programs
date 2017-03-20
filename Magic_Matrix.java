import java.io.*;
class Magic_Matrix 
{
    public static void main()throws IOException 
    { 
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the limit");
        int n=Integer.parseInt(dr.readLine());

        int[][] magic=new int[n][n];

        int r=n-1;
        int c=n/2;
        magic[r][c]=1;

        for(int i=2;i<=n*n;i++) 
        {
            if(magic[(r + 1)%n][(c + 1)%n]==0) 
            {
                r=(r + 1)%n;
                c=(c + 1)%n;
            }
            else
            {
                r=(r-1+n)%n;
            }
            magic[r][c]=i;
        }

        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<n;j++) 
            {
                if(magic[i][j]< 10)
                System.out.print(" ");
                
                if(magic[i][j]<100) 
                System.out.print(" ");
                
                System.out.print(magic[i][j]+" ");
            }
            System.out.println();
        }

    }
}