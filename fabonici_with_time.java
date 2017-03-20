package BigInteger;

import java.math.BigInteger;
import java.io.*;
class fabonici_with_time
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the limit");
        int n=Integer.parseInt(dr.readLine());
        
        fabonici_with_time z=new fabonici_with_time();
        
        double start=System.nanoTime();
        
        z.fab(n);
        
        double end=System.nanoTime()-start;
        
        System.out.print(end+" seconds");
        
    }
    
    public void fab(int n)
    {
        int x=n;
        
        BigInteger a=new BigInteger("0");
        BigInteger b=new BigInteger("1");
        BigInteger t;
        
        while((n--)>1)
        {
            t=b;
            b=b.add(a);
            a=t;
        }
        
        System.out.println("the fabonicci number at "+x+" is");
        System.out.println(b);
        System.out.println("the time taken is ");
    }
}