import java.io.*;
    class bracket
    {
    public static void main(String args[])throws IOException
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,j;String s1="";
    char ch,ch2;
    System.out.print("enter string");
    String s=br.readLine();
    for(i=0;i<s.length();i++)
    {
    ch=s.charAt(i);
    if(ch=='(')
    {
    for(j=s.length()-1;j>i;j--)
    {
    ch2=s.charAt(j);
    if(ch2!=')')
    {
    s1=s1+ch2;
    }
    else break;
    }
    System.out.println(s1);
    s1="";
    }
    }
    }
    }