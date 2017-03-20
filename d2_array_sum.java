import java.io.*;
class d2_array_sum
{
public static void main()throws IOException
{
int i,j,n,m,sl=0,sr=0,s=0,s3=0;
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter limit of rows");
n=Integer.parseInt(dr.readLine());
System.out.println("Enter limit of columns");
m=Integer.parseInt(dr.readLine());
int a[][]=new int[n][m];
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.println("Enter the no. at index"+i+j);
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
s=s+a[i][j];
}
System.out.print("sum of rows"+i+"=\t"+s);
System.out.println();
s=0;
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(n==m)
{
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==j)
sl=sl+a[i][j];
else if((i+j)==(n-1))
sr=sr+a[i][j];
}
}
System.out.println("sum of left diagnals="+sl);
System.out.println("sum fo right diagnals="+sr);
}
else
System.out.println("sum of diagnols is not possible bec.it not a square matrix");
}}
}}