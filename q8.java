import java.io.*;
public class q8
{
public void func()throws IOException
{double p,n,a,t,r,b,c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter principle");
p=Integer.parseInt(br.readLine());
System.out.println("enter time period ");
n=Integer.parseInt(br.readLine());
if(n<1)
r=9;
else if(n>=1&&n<2)
 r=10;
 else if(n>=2&&n<3)
r=11;
 else
r=12;
c=1+(r/100);
b=Math.pow(c,n);
a=p*b;
 System.out.println("amount is ="+a);
 }
 }
                                                                                                                                                               