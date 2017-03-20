import java.io.*;
class Multiply_matrix
{
public static void main()throws IOException
{
int i,j,r1,c1,r2,c2,k;
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter limit of rows");
r1=Integer.parseInt(dr.readLine());
System.out.println("Enter limit of columns");
c1=Integer.parseInt(dr.readLine());
System.out.println("Enter limit of rows");
r2=Integer.parseInt(dr.readLine());
System.out.println("Enter limit of columns");
c2=Integer.parseInt(dr.readLine());
int a[][]=new int[r1][c1];
int b[][]=new int[r2][c2];
int c[][]=new int[r1][c2];
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
System.out.println("Enter the no. at index "+i+j);
a[i][j]=Integer.parseInt(dr.readLine());
}
}
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
System.out.println("Enter the no. at index "+i+j);
b[i][j]=Integer.parseInt(dr.readLine());
}
}
// SHOWING THE 2 MATRIX
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
System.out.print(a[i][j]+" ");
System.out.println();
}
System.out.println();
System.out.println();
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
System.out.print(b[i][j]+" ");
System.out.println();
}
//MULTIPLYING THE 2 MATRICES
if(c1==r2)
{
for(i=0; i<r1; i++)
{
for(j=0; j<c2; j++)
{
for(k=0; k<c1; k++)
{
				    c[i][j]+=a[i][k]*b[k][j];
			    }
			}
		}
			
		//Output m3
		System.out.println("result");
		for (i=0; i<r1; i++)
		{
			for (j=0; j<c2; j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();

		}
	}
	else
	System.out.println("Multiplication is not possible");
	}
}