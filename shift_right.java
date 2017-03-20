package BigInteger;

import java.math.BigInteger;
import java.io.*;

//  x/(2 raise to  power n)

class shift_right
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the number");
        String n=dr.readLine();
        BigInteger a=new BigInteger("4");
        BigInteger b=a.shiftRight(3);
        
        System.out.println(b);
    }
}
