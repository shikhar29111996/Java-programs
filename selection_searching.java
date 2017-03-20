import java.io.*;
class selection_searching
{
public static void main()throws IOException
{
int i,j,p,s=0,t,b,d,c,f=0;
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter limit of no.");
b=Integer.parseInt(dr.readLine());
int a[]=new int[b];
for(i=0;i<b;i++)
{
System.out.println("Enter the no."+i);
d=Integer.parseInt(dr.readLine());
a[i]=d;
}
for(i=0;i<b;i++)
{
s=a[i];
p=i;
for(j=i+1;j<b;j++)
{
if(a[j]<s)
{
p=j;
s=a[j];
}
}
t=a[i];
a[i]=s;
a[p]=t;
}
System.out.println("Sorted Array");
for(i=0;i<b;i++)
System.out.println(a[i]);
System.out.println("Enter the no. to be searched");
c=Integer.parseInt(dr.readLine());
for(i=0;i<b;i++)
{
if(a[i]==c)
{
f=1;
s=i;
break;
}
}
if(f==1)
System.out.println("No. is found at index "+s);
else
System.out.println("No. is not found");
}
}