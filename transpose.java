import java.io.*;
public class transpose
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
int b[][]=new int[c][r];
for(i=0;i<c;i++)
{
for(j=0;j<r;j++)
{
b[i][j]=A[j][i];
}
}
for(i=0;i<c;i++)
{
for(j=0;j<r;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println();
}
}
}