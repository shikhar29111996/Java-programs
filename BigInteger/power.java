package BigInteger;

import java.math.BigInteger;
import java.io.*;
class power
{
    public static void main(String args[])throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the number");
        String n=dr.readLine();
        
        System.out.println("enter the power number");
        int z=Integer.parseInt(dr.readLine());
        
        BigInteger a=new BigInteger(n);
        BigInteger b=a.pow(z);
        
        System.out.println(b);
    }
}