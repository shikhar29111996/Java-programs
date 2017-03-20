class pattern3
    {
    public static void main(int n)
    {
    int i,j,a;
    for(i=n;i>=1;i=i-2)
    {
    for(a=n-2;a>=i;a=a-1)
    {
    a--;
System.out.print(" ");
    }
    for(j=1;j<=i;j++)
    {
    System.out.print("*");
    }
    System.out.println();
    }
    for(i=3;i<=n;i=i+2)
    {
    for(a=n-2;a>=i;a--)
    {
    a--;
    System.out.print(" ");
    }
    for(j=1;j<=i;j++)
    {
    System.out.print("*");
    }
    System.out.println();
    }}}