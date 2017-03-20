import java.io.*;
class Happy_number
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        int a,c=0,d;
        
        System.out.println("enter the number");
        int n=Integer.parseInt(dr.readLine());
        
        while(n>=10)
        {
            a=n;c=0;
            while(a>0)
            {
                d=a%10;
                c=c+(d*d);
                a=a/10;
            }
            n=c;
        }
        
        if(c==1)
        {
            System.out.println("Happy number");
        }
        else
        {
            System.out.println("not a happy number");
        }
    }
}