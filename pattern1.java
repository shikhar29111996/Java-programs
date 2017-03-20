class pattern1
    {
    public static void main(int n)
    {
    int i,j,k;
    System.out.println("no.of rows="+n);
    for(i=1;i<=n;i++)
    {
    for(j=i;j<=2*i-1;j++)
    {
    System.out.print(j+" ");
    }
    for(k=2*i-2;k>=i;k--)
    {
    System.out.print(k+" ");
    }
    System.out.println();
    }
    }
    }
    