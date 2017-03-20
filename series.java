import java.io.*;
public class series
{
int x,n;double s,j,p,d,k,a;
series()
{
x=0;
n=0;
s=0.0;
p=0.0;
j=0.0;
k=0.0;
a=0.0;
}
series(int nx,int nn)
{
x=nx;
n=nn;
}
int fact(int d)
{
if(d!=0)
return d*fact(--d);	
else
return 1;
}

int pow(int a, int b)
{
if(b>0)
return a*pow(a,b-1);
else
return 1;
}
void sumsr()
{
for(int i=2;i<=n;i++)
{
k=fact(i+1);
a=pow(x,i);
j=a/k;
//System.out.println(j);
if(i%2==0)
s=s+j;
else
s=s-j;
}
s=s+1.0;
System.out.println("sum is "+s);
}
public static void main()throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr); 
System.out.println("enter X ");
int x=Integer.parseInt(br.readLine());
System.out.println("enter limit ");
int n=Integer.parseInt(br.readLine());
series ob=new series(x,n);
ob.sumsr();
}

	}