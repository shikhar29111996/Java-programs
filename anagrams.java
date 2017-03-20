import java.io.*;
class anagrams
{
public static void main(String args[])throws IOException
{
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
int x,i,j,k=0,v=0,y;
String name="",name1="";
char b=0,c=0;
System.out.println("enter the name");
name=dr.readLine();
x=name.length();
for(i=0;i<x;i++)
{
b=name.charAt(i);
k=k+(int)(b);
}
System.out.println("enter the second name");
name1=dr.readLine();
y=name1.length();
for(j=0;j<y;j++)
{
c=name.charAt(j);
v=v+(int)(c);
}
if(k==v)
System.out.println("words are anagrams");
else
System.out.println("words are not anagrams");
}
}