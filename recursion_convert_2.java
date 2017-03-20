import java.io.*;
class recursion_convert_2
{
    long bin,dec;
    
    public void readbin()throws IOException
    {
        long c=0;
        double d=0;
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("entyer the number");
        bin=Integer.parseInt(dr.readLine());
        
        System.out.println("\n \n binary number="+bin);
        
        convertdec(bin,c,d);
    }
    
    public void convertdec(long n,long c,double d)
    {        
        if(n>0)
        {
            d=d+((n%10)*Math.pow(2,c));
            convertdec((n/10),++c,d);
        }
        
        else
        {
            System.out.println(d);
        }
    }
    
    public void show()throws IOException
    {
        readbin();
    }
}