import java.io.*;
    class string_p1
    {
    public static void main()throws IOException
    {
    BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("ener the string");
    String a=dr.readLine();
    a=" "+a;
    int i,y;
    y=a.length();
    for(i=1;i<=y;i++)
    System.out.println(a.substring(1,i));
    }
    }