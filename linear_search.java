import java.io.*;
public class linear_search
{
public void func()throws IOException
{
int n,b,c,i,f=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the limit");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
for(i=0;i<n;i++)
{
System.out.println("Enter the no.");
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("Enter the no. to be searched");
c=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
if(a[i]==c)
{
f=1;
break;
}
}
if(f==1)
System.out.println("Element found at index "+i);
else
System.out.println("Element not found ");
}
}
