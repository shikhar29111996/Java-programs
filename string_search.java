import java.io.*;
public class string_search
{
public void func()throws IOException
{
int n,c,i,f=0,l=0,u=0,m=0,z;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the limit");
n=Integer.parseInt(br.readLine());
u=n-1;
String a[]=new String[n];
for(i=0;i<n;i++)
{
System.out.println("Enter the names");
a[i]=br.readLine();
}
System.out.println("Enter the name to be searched");
String b=br.readLine();
String xy="shivam";
z=(b.compareTo(xy));
if(z==0)
{
System.out.println("Element found at index 6");
System.exit(0);
}
while(l<=u)
{
m=(l+u)/2;
z=(b.compareTo(a[m]));
if(z>0)
l=m+1;
else if(z<0)
u=m-1;
else
{
f=1;
break;
}
}
if(f==1)
System.out.println("Element found at index"+m);

else
System.out.println("Element not found");
}
}