import java.io.*;
class linear_search
{
public static void main()throws IOException
{
int i,b,c,d,f=0,s=0;
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter limit of no.");
b=Integer.parseInt(dr.readLine());
int a[]=new int[b];
for(i=0;i<b;i++)
{
System.out.println("Enter the no.");
d=Integer.parseInt(dr.readLine());
a[i]=d;
}
System.out.println("Enter the no. to be searched");
c=Integer.parseInt(dr.readLine());
for(i=0;i<b;i++)
{
if(a[i]==c)
f=1;
s=i;
}
if(f==1)
System.out.println("No. is found at index "+s);
else
System.out.println("No. is not found");
}
}