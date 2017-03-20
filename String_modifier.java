import java.io.*;
class String_modifier
{
    String a="",b="",c="";
    char ch;
    
    
    void getstring()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter 1st string");
        a=dr.readLine();
        System.out.println("enter 2nd string");
        b=dr.readLine();
        System.out.println("enter 3rd string");
        c=dr.readLine();
        System.out.println("enter the character");
        ch=(char)dr.read();
    }
    
    void changestr()
    {
        int i;
        char z;
        
        System.out.println();
        System.out.println();
        
        System.out.print(ch);
        for(i=1;i<a.length();i++)
        {
            System.out.print(a.charAt(i));
        }
        System.out.println();
        
        System.out.print(ch);
        for(i=1;i<b.length();i++)
        {
            System.out.print(b.charAt(i));
        }
        System.out.println();
        
        System.out.print(ch);
        for(i=1;i<c.length();i++)
        {
            System.out.print(c.charAt(i));
        }
    }
    
    void nextstr()
    {
        int i;
        char z;
        
        System.out.println();
        System.out.println();
        
        System.out.println();
        for(i=0;i<a.length();i++)
        {
            z=a.charAt(i);
            int m=(int)z;
            m++;
            System.out.print((char)m);
        }
    
    System.out.println();
        for(i=0;i<b.length();i++)
        {
            z=b.charAt(i);
            int m=(int)z;
            m++;
            System.out.print((char)m);
        }
    
    System.out.println();
        for(i=0;i<c.length();i++)
        {
            z=c.charAt(i);
            int m=(int)z;
            m++;
            System.out.print((char)m);
        }
    }
            
    public static void main()throws IOException
    {
        String_modifier h=new String_modifier();
        
        h.getstring();
        h.changestr();
        h.nextstr();
    }
}