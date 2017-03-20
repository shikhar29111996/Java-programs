import java.io.*;
 class spiral
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=1,r=0,e=-1,i,j,n;
System.out.println("enter the size");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
int l2=n;
String pnt;
while(n>0)
{
for(i=1;i<=n;i++)
{
a[r][++e]=t++;
}
for(i=1;i<n;i++)
{
a[++r][e]=t++;
}
for(i=1;i<n;i++)
{
a[r][--e]=t++;
}
for(i=1;i<n-1;i++)
{
a[--r][e]=t++;
}
n=n-2;
}
for(i=0;i<l2;i++)
{
for(j=0;j<l2;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
}