import java.io.*;
class search_contact
{
public static void main(String args[])throws IOException
{
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
int a,i,c=0,l=0,n;
char ch;
String b="";
System.out.println("enter the no of names");
n=Integer.parseInt(dr.readLine());
String m[]=new String[n];
for(i=0;i<n;i++)
{
System.out.println("enter th name");
m[i]=dr.readLine();
}
System.out.println("enter the first character to be searched");
ch=(char)(dr.read());

for(i=0;i<n;i++)
{
b=m[i];
if(b.charAt(0)==ch)
{
System.out.println(m[i]);
c=c+1;
}
}
if(c==0)
System.out.println("no name is found");
}
}