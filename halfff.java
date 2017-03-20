import java.io.*;
class halfff
{
public void func()throws IOException
{
int r,c,i,j,s=0,sum=0;
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
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(i==j)
{
if(j<c-1)
{
System.out.println("upper half");
for(int k=j+1;k<c;k++)
System.out.print(A[i][k]+" ");
}
System.out.println();
if(j>0)
{
System.out.println("lower half");
for(int l=0;l<j;l++)
{
System.out.print(A[i][l]+" ");
}
}
}
}
}
}
}
