import java.io.*;
class handsome
{
public void get()throws IOException
{
int a,m,n,c,d=0,k=0,f=0,i,r=0,q; 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any no.");
a=Integer.parseInt(br.readLine());
n=a;
m=a;
m=m/10;
n=n%10;
while(true)
{
c=m%10;
d=d+c;
m=m/10;
if(c==0)
break;
}
k=d;
while(true)
{
d=d/10;
f++;
if(d==0)
break;
}
if(f>1)
{
for(i=1;i<=f;i++)
{
q=k%10;
r=r+q;
k=k/10;
}
k=r;}
if(k==n)
System.out.println(" handsome no.");
else
System.out.println(" not handsome no.");
}
}


