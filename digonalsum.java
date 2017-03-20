import java.io.*;
public class digonalsum
{
public void func()throws IOException
{
int r,c,i,j,s=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the rows & columns");
r=Integer.parseInt(br.readLine());
c=Integer.parseInt(br.readLine());
int A[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.println("Enter the "+i+j+"no.");
A[i][j]=Integer.parseInt(br.readLine());
}
}
if(r==c)
{
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(i==j)
s=s+A[i][j];
}
}
System.out.println("The sum of left diagonal is"+s);
}
else
System.out.println("Matrix is not a square matrix");
}
}