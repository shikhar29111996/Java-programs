import java.io.*;
public class twodarray
{
public void func()throws IOException
{
int r,c,i,j;
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
System.out.print(A[i][j]+" ");
}
System.out.println();
}
}
}