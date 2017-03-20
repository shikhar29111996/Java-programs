import java.io.*;
public class position
{
public void func()throws IOException
{
int n,c,i,f=0,pos,d;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the limit");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
int b[]=new int[n+1];
for(i=0;i<n;i++)
{
System.out.println("Enter the no.");
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("Enter the no. to be inserted");
d=Integer.parseInt(br.readLine());
System.out.println("Enter the position .");
pos=Integer.parseInt(br.readLine());
for(i=0;i<pos;i++)
b[i]=a[i];
b[pos]=d;
for(i=pos+1;i<n+1;i++)
b[i]=a[i-1];
for(i=0;i<n+1;i++)
System.out.print(b[i]+" ");
}
}

