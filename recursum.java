import java.io.*;
public class recursum
{
	static int pow(int n,int m)
	{
	if(m>0)
	{
	return n*pow(n,m-1);
	}
	else{
	if(m<0)
	{
	return n*pow(n,m+1);
	}
	else 
return 1;
	}
	}
	
	void sumser()throws IOException
	{
	InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("enter no.");
int n=Integer.parseInt(br.readLine());
System.out.println("enter power.");
int m=Integer.parseInt(br.readLine());
int s=0;
double sm=0;
if(m>0)
{
for(int i=1;i<=m;i++)
{
int g=pow(n,i);
s=s+g;
}
System.out.println("ans"+s);
}
else
{
for(int i=m;i<0;i++)
{
int k=Math.abs(i);
double g=pow(n,k);
System.out.println("as"+g);
double e=1/g;
sm=sm+e;
}
System.out.println("ans"+sm);
}
}
}
