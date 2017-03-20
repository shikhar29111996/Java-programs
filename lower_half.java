import java.io.*;
class lower_half
{
public static void main()throws IOException
{
int i,j,r,c;
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
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
    if(i>=j)
    System.out.print(" "+a[i][j]);
    else
    System.out.print(" ");
    }
    System.out.println();
    }
    }
    }