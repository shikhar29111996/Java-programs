package BigInteger;

import java.math.BigInteger;
import java.util.*;
class remainder
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The First Number= ");
        String a=in.next();
        System.out.print("Enter The Second Number= ");
        String b=in.next();

        BigInteger obj=new BigInteger(a);
        BigInteger obj1=new BigInteger(b);
        System.out.println("Remainder="+obj.remainder(obj1));
    }
}