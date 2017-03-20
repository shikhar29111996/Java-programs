import java.io.*;
public class symmetry
{
public void func()throws IOException
{
int r,c,i,j,s=0,f=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("Enter the rows & columns");
r=Integer.parseInt(br.readLine());
c=Integer.parseInt(br.readLine());
if(r!=c)
System.out.println("enter a square matrix");
}while(r!=c);
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
if(A[i][j]!=A[j][i])
{
f=1;
break;
}
}
}
if(f==0)
System.out.println("Array is symmetric");
else
System.out.println("Array is not symmetric");
}
}
