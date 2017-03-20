import java.io.*;
class reverse_sentence
{
public static void main(String args[])throws IOException
{
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
int x,y,z;
String m="",p="",name="";
char b=0;
System.out.println("enetr the sentence");
name=dr.readLine();
name=name+" ";
x=name.length();
for(y=0;y<x;y++)
{
b=name.charAt(y);
if(b==' ')
{
p=m+" "+p;
m="";
}
else
m=m+b;
}
System.out.println(p);
}
}