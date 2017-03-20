import java.io.*;
class selection_sort
{
public static void main()throws IOException
{
int i,j,p,s,t,b,d;
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
}
}