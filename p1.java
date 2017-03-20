import java.io.*;
class p1
{
public static void main()throws IOException
{
int a,b,c=0,s=0,d,e=0,f=0,i,j;
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your number");
a=Integer.parseInt(dr.readLine());
b=a%10;
d=a/10;
while(a!=0)
{
c=a%10;
s=s+1;
a=a/10;
}
j=s-1;
for(i=1;i<=j;i++)
{
e=d%10;
f=f+e;
d=d/10;
}
if(f==b)
System.out.println("yes");
else
System.out.println("no");
}
}
