package BigInteger;

import java.math.BigInteger;
import java.io.*;

class minimum
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the number");
        String n=dr.readLine();
        
        System.out.println("enter the power number");
        String m=dr.readLine();
        
        BigInteger a=new BigInteger(n);
        BigInteger b=new BigInteger(m);
        
        System.out.println(a.min(b));
    }
}