import java.io.*;
class neon
{
public void shikhar(int a)
{
int n,s=0,c;
n=a*a;
while(n!=0)
{
c=n%10;
s=s+c;
n=n/10;
}
if(s==a)
System.out.println(a+" is a neon number");
else
System.out.println(a+" is not a neon number");
}
public static void main()throws IOException
{
neon r=new neon();
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
for(int i=1;i<=100;i++)
r.shikhar(i);
}
}