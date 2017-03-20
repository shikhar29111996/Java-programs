import java.io.*;
class cheque_square
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        int i,j,a,b,c,d,z,e,f;
        
        for(i=32;i<=99;i++)
        {
            z=i*i;
            a=z%10;
            b=z%100;
            c=z%1000;
            d=z%10000;
            
            System.out.println(a+","+b+","+c+","+d);
        }
    }
}