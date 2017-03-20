import java.io.*;
class d2_sorting
{
public static void main()throws IOException
{
int i,j,n,m,t=0,k=0;
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
for(j=0;j<m;j++)
{
b[k]=a[i][j];
k++;
}
}
for(i=0;i<b.length;i++)
{
for(j=0;j<b.length-1;j++)
{
if(b[j]>b[j+1])
{
t=b[j];
b[j]=b[j+1];
b[j+1]=t;
}
}
}
k=0;
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=b[k];
k++;
}
}
System.out.println("Matrix after sorting");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
System.out.print(a[i][j]+"\t");
System.out.println();
}
}
}