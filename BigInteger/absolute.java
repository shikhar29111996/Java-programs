package BigInteger;

import java.io.*;
import java.math.BigInteger;

class absolute
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the number");
        String n=dr.readLine();
        
        BigInteger a=new BigInteger(n);
        BigInteger b=a.abs();
        
        System.out.println("absolute value is "+b);
    }
}