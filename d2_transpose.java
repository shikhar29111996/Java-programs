import java.io.*;
class d2_transpose
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
int b[][]=new int[m][n];
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
b[j][i]=a[i][j];
}
}
System.out.println("transpose matrix of above matrix-");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(b[i][j]+"\t");
}
System.out.println();
}
}
}