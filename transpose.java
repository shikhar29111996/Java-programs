import java.io.*;
    class transpose
    {
    public static void main(String args[])throws IOException
    {
    int n,i,j,a=0;
    BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter number of rows and coulums");
    n=Integer.parseInt(dr.readLine());
    int t[][]=new int[n][n];
    for(i=0;i<n;i++)
    {
    for(j=0;j<n;j++)
    {
    System.out.println("enter the element");
    t[i][j]=Integer.parseInt(dr.readLine());
    }
    }
    System.out.println("entered Matrix");
    for(i=0;i<n;i++)
    {
    for(j=0;j<n;j++)
    {
    System.out.print(t[i][j]+" ");
    }
    System.out.println();
    }
    System.out.println("matrix after transpose");
    for(i=0;i<n;i++)
    {
    for(j=0;j<i;j++)
    {
    a=t[i][j];
    t[i][j]=t[j][i];
    t[j][i]=a;
    }
    }
    for(i=0;i<n;i++)
    {
    for(j=0;j<n;j++)
    {
    System.out.print(t[i][j]+" ");
    }
    System.out.println();
    }
    }
    }