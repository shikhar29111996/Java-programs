package BigInteger;

import java.math.BigInteger;
import java.io.*;

//returns the number of bits in the minimal two's-complement representation of this BigInteger, excluding a sign bit. For positive BigIntegers, this is equivalent to the number of bits in the ordinary binary representation. It computes (ceil(log2(this < 0 ? -this : this+1))).

class bitLength
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the number");
        String n=dr.readLine();
        BigInteger a=new BigInteger(n);
        
        System.out.println(a.bitLength());
    }
}