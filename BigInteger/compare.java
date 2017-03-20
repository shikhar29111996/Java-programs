package BigInteger;

import java.math.BigInteger;
import java.io.*;

// 0->Equal
// 1->first is greater
// -1->second is greater

class compare
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the number");
        String x=dr.readLine();
        BigInteger a=new BigInteger(x);
        
        System.out.println("enter the number");
        String y=dr.readLine();
        BigInteger b=new BigInteger(y);
        
        System.out.println(a.compareTo(b));
    }
}