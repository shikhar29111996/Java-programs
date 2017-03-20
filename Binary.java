import java.io.*;
class Binary
{
public static void main(String args[])throws IOException
{
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
int n,r,q=0;
String s="";
System.out.println("enter the number");
n=Integer.parseInt(dr.readLine());
while(q!=1)
{
r=n%2;
q=n/2;
n=q;
s=r+s;
}
s=1+s;
System.out.println("binary equvilant="+s);
}
}