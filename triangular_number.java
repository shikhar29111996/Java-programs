import java.io.*;
class triangular_number
{
    public static void main()throws IOException
    {
        int n,m,i,j,s=0;
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the to check whether it is a triangular number or not");
        n=Integer.parseInt(dr.readLine());
        for(i=1;i<n;i++)
        {
            for(j=i;j<=n;j++)
            {
                s=s+j;
                if(s>n)
                break;
           
                if(s==n)
                {
                    for(m=i;m<=j;m++)
                    System.out.print(m);
                    System.out.println();
                }
                
            }
            s=0;
        }
    }
}