import java.io.*;
class matrix_symmetric
{
public static void main()throws IOException
{
int i,j,r,c,m=1;
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter limit of rows");
r=Integer.parseInt(dr.readLine());
System.out.println("Enter limit of columns");
c=Integer.parseInt(dr.readLine());
int a[][]=new int[r][c];
    int b[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.println("Enter the no. at index "+i+j);
a[i][j]=Integer.parseInt(dr.readLine());
}
}
System.out.println("Resultant matrix");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
    if(r==c)
    {
    for(i=0;i<r;i++)
    {
    for(j=0;j<r;j++)
    b[j][i]=a[i][j];
    }
    for(i=0;i<r;i++)
    {
    for(j=0;j<r;j++)
    if(a[i][j]!=b[j][i])
    m=0;
    }
    if(m!=0)
    System.out.println("matrix is symmetrc");
    }
    if((r!=c)||(m==0))
    System.out.println("matrix is");
    }
    }