import java.io.*;
public class selection
{
public void func()throws IOException
{
int small,i,pos,j,temp,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the limit");
n=Integer.parseInt(br.readLine());

int a[]=new int[n];
for(i=0;i<n;i++)
{
System.out.println("Enter the no.");
a[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<n;i++)
{
small=a[i];
pos=i;
for(j=i+1;j<n;j++)
{
if(a[j]<small)
{
small=a[j];
pos=j;
}
}
temp=a[i];
a[i]=small;
a[pos]=temp;
}
for(i=0;i<n;i++)
{
System.out.print(a[i]+",");
}
}
}