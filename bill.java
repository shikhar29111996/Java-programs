import java.io.*;
public class bill  
{
	int n;
	double amt;
	
	bill(String nn,String aa,String tt,int rr,int no)
	{
	super(nn,aa,tt,rr);
	n=no;
	amt=0.0;
	}
public void calc()
{
if(n>=1&&n<=100)
amt=rent;
else
if(n>=101&&n<=200)
amt=(n-100)*(0.60)+rent;
else
if(n>=201&&n<=300)
amt=100*0.60+(n-200)*(0.80)+rent;
else
if(n>301)
amt=(n-300)*1+rent;
}
void show()
{
super.disp();
calc();
System.out.println("amount is "+amt);
}
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("name is ");
	String nn=br.readLine();
	System.out.println("addres is ");
	String aa=br.readLine();
	System.out.println("telphone is ");
	String tt=br.readLine();
	System.out.println("rent is ");
	int rr=Integer.parseInt(br.readLine());
	System.out.println("no. of call is ");
	int no=Integer.parseInt(br.readLine());
	bill b=new bill(nn,aa,tt,rr,no);
	b.show();
	}
	}
	
	