import java.io.*;
class palindrome_string
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        int n,i,j;
        String text;
        System.out.println("enter the name");
        text=dr.readLine();
        StringBuffer a= new StringBuffer(text);
        StringBuffer b=a.reverse();
        String c=new String(b);
        if(text.equalsIgnoreCase(c))
        System.out.println("yes");
        else
        System.out.println("no");
    }
}