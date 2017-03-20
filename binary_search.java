import java.io.*;
public class binary_search
{
public void func()throws IOException
{
int n,b,c,i,f=0,l=0,u=0,m=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the limit");
n=Integer.parseInt(br.readLine());
u=n-1;
int a[]=new int[n];
for(i=0;i<n;i++)
{
System.out.println("Enter the no.");
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("Enter the no. to be searched");
c=Integer.parseInt(br.readLine());
while(l<=u)
{
m=(l+u)/2;
if(a[m]<c)
l=m+1;
else if(a[m]>c)
u=m-1;
else
{
f=1;
break;
}
}
if(f==1)
System.out.println("Element found at Index"+m);
else
System.out.println("Element not found");
}
}
