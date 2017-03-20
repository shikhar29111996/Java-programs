class pascal_1
{
public static void main()
{
int x=6,i,j;
int a[][]=new int[x][x];
for(i=0;i<x;i++)
{
for(j=0;j<x;j++)
{
a[i][j]=0;
}
}
for(i=0;i<x;i++)
{
a[i][0]=1;
}
for(i=1;i<x;i++)
{
for(j=1;j<x;j++)
{
a[i][j]=a[i-1][j-1]+a[i-1][j];
}
}
for(i=0;i<x;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}