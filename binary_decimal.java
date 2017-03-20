import java.io.*;
class binary_decimal
{
public static void main(String args[])throws IOException
{
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
int m=0,n,p,d,q=0;
double sum=0;
System.out.println("enter the binary number");
n=Integer.parseInt(dr.readLine());
while(n!=0)
{
q=n/10;
p=q*10;
d=n-p;
sum=sum+d*Math.pow(2,m);
n=q;
m=m+1;
}
System.out.println("the decimal number = "+(int)sum);
}
}