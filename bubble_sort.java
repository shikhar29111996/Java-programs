import java.io.*;
class bubble_sort
{
public static void main()throws IOException
{
int i,j,k,t,b,d;
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
for(j=0;j<b-1;j++)
{
if(a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
System.out.println("Sorted Array");
for(i=0;i<b;i++)
System.out.println(a[i]);
}
}