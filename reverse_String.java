import java.io.*;
    class reverse_String
    {
    public static void main()throws IOException
    {
    int x,y,z;
    String m="",p="",a;
    char b;
    BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("ener the string");
    a=dr.readLine();
    a=a+" ";
    x=a.length();
    for(y=0;y<x;y++)
    {
    b=(a.charAt(y));
    if(b==' ')
    {
    p=p+" "+m;
    m="";
    }
    else
    m=b+m;
    }
    System.out.println(p);
    }
    }