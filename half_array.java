import java.io.*;
class half_array
{
public static void main()throws IOException
{
int i,j,t,n;
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter limit of no.");
n=Integer.parseInt(dr.readLine());
int a[]=new int[n];
int m=n/2;
for(i=0;i<n;i++)
{
System.out.println("Enter the no."+i);
a[i]=Integer.parseInt(dr.readLine());

}
    System.out.println("\n Elements of the array are");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
    if(n%2==0)
    j=m;
    else
    j=m+1;
    
    for(i=0;i<m;i++)
    {
    t=a[i];
    a[i]=a[j];
    a[j]=t;
    j++;
    }
    for(i=0;i<n;i++)
    {
    System.out.print(a[i]+" ");
    }
    }
    }