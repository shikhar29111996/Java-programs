import java.io.*;
public class buuzz
{
public void func()throws IOException
{
int n,a=0,b;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any no.");
n=Integer.parseInt(br.readLine());
if(n%7==0)
a=n;
b=a%10;
if(b==7)
System.out.println("No. is buuzz");
else
System.out.println("No. is not buuzz");
}
}