import java.io.*;         
public class q4
{
public void func()throws IOException
{
double q,r,a;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter your product code");
String p0=br.readLine();
char p=p0.charAt(0);
System.out.println("enter your quantity of product");
q=Integer.parseInt(br.readLine());
System.out.println("enter your rate of 1 piece of product ");
r=Integer.parseInt(br.readLine());
a=q*r;
if(a>=200&&a<700)
System.out.println("a key chain");
else if(a>=700&&a<1200)
 System.out.println("a carry bag");
 else if(a>=1200)
 System.out.println("an electronc calculator");
 else
 System.out.println("bhag yahan se");
 }
 }