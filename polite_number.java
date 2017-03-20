import java.io.*;
class polite_number
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the number");
        int n=Integer.parseInt(dr.readLine());
        int i;
        
        double a;
        
        for(i=1;i<n;i++)
        {
            a=Math.pow(2,i);
            if(n==a)
            {
                System.out.println("yes");
                break;
            }
            
            if(a>n)
            break;
        }
    }
}