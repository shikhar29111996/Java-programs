import java.io.*;
    class freq_count
    {
    String str=new String();
    void getdata()throws IOException
    {
    DataInputStream d=new DataInputStream(System.in);
    System.out.println("enter the name");
    str=d.readLine();
    int len,c=0,m,i,s;
    char ch,che;
    str=str.toUpperCase();
    len=str.length();
    for(m=65;m<90;m++)
    {
    c=0;
    for(i=0;i<len;i++)
    {
    ch=str.charAt(i);
    s=(int)ch;
    if(s==m)
    {
    c=c+1;
    }
    }
    che=(char)m;
    if(c!=0)
    System.out.println("Frequency of "+che+" is "+c);
    }
    }
    }