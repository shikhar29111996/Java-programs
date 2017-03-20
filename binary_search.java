import java.io.*;
class binary_search
{
public static void main()throws IOException
{
int i,c,l=0,u,m=0,f=0;
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter limit of no.");
u=Integer.parseInt(dr.readLine());
int a[]=new int[u];
System.out.println("Enter the no. in ascending order");
for(i=0;i<u;i++)
a[i]=Integer.parseInt(dr.readLine());
System.out.println("Enter the no. to be searched");
c=Integer.parseInt(dr.readLine());
while(l<=u)
{
m=(l+u)/2;
if(c>a[m])
l=m+1;
else if(c<a[m])
u=m-1;
else
{
f=1;
break;
}
}
if(f==1)
System.out.println("No. is found at index "+(m+1));
else
System.out.println("No. is not found");
}
}