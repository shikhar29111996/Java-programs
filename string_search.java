import java.io.*;
class string_search
{
public static void main()throws IOException
{
int i,l=0,u,m=0,f=0,s=0;
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter limit of names");
u=Integer.parseInt(dr.readLine());
String a[]=new String[u],c;
System.out.println("Enter the names");
for(i=0;i<u;i++)
a[i]=dr.readLine();
System.out.println("Enter the name to be searched");
c=dr.readLine();
while(l<=u)
{
m=(l+u)/2;
if(c.compareTo(a[m])>0)
l=m+1;
else if(c.compareTo(a[m])<0)
u=m-1;
else
{
f=1;
break;
}
}
if(f==1)
System.out.println("No. is found at place "+(m+1));
else
System.out.println("No. is not found");
}
}