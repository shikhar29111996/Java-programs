import java.io.*;
class add_sub_mul_div
{
public static void main()throws IOException
{
int a,b;
char ch;
double c,d,s=0;
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 1st number");
a=Integer.parseInt(dr.readLine());
System.out.println("Enter 1st number");
b=Integer.parseInt(dr.readLine());
System.out.println("Enter the operand- +,-,*,/");
String p=dr.readLine();
ch=p.charAt(0);
c=Math.max(a,b);
d=Math.min(a,b);
if(ch=='+')
s=a+b;
if(ch=='-')
s=c-d;
if(ch=='*')
s=a*b;
if(ch=='/')
s=c/d;
System.out.println(s);
}
}