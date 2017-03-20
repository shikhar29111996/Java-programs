import java.io.*;
class pascal
{
public static void main()throws IOException
{
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));;
int i,j,n,a;
System.out.println("Enter a number");
n=Integer.parseInt(dr.readLine());
int []p=new int [n];
p[0]=1;
a=n-1;
for(i=0;i<n;i++)
{
for(j=0;j<i;j++)
System.out.print(p[j]+" ");
for(j=i;j>=1;j--)
p[j]=p[j]+p[j-1];
System.out.println();
}
}
}