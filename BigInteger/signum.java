package BigInteger;

import java.math.BigInteger;
import java.io.*;

class signum
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the number");
        String n=dr.readLine();
        BigInteger a=new BigInteger(n);
        
        System.out.println(a.signum());
    }
}