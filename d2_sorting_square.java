import java.io.*;
class d2_sorting_square
{
public static void main()throws IOException
{
int i,j,n,m,t=0;
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter limit of rows");
n=Integer.parseInt(dr.readLine());
System.out.println("Enter limit of columns");
m=Integer.parseInt(dr.readLine());
int a[][]=new int[n][m];
int b[]=new int[n*m];
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.println("Enter the no. at index "+i+j);
a[i][j]=Integer.parseInt(dr.readLine());
}
}
System.out.println("Resultant matrix");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
for(i=0;i<n;i++)
{
for(j=0;j<m-1;j++)
{
if(a[i][j]>a[i][j+1])
{
t=a[i][j];
a[i][j]=a[i][j+1];
a[i][j+1]=t;
}
}
}
System.out.println("Sorted Array");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
System.out.print(a[i][j]+"\t");
System.out.println();
}
}
}