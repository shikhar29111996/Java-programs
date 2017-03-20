package BigInteger;

import java.math.BigInteger;
import java.io.*;

//returns the number of bits in the two's complement representation of this BigInteger that differ from its sign bit. This method is useful when implementing bit-vector style sets atop BigIntegers.

class bitcount
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the number");
        String n=dr.readLine();
        BigInteger a=new BigInteger(n);
        
        System.out.println(a.bitCount());
    }
}
