class pattern6
    {
    public static void main(int n)
    {
    int i,j,a;
    for(i=1;i<=n;i++)
    {
    for(a=n-1;a>=i;a--)
    {
    System.out.print(" ");
    }
    for(j=1;j<=i;j++)
    {
    System.out.print("*"+" ");
    }
    System.out.println();
    }
    for(i=n-1;i>=1;i--)
    {
    for(a=n-1;a>=i;a=a-1)
    {
System.out.print(" ");
    }
    for(j=1;j<=i;j++)
    {
    System.out.print("*"+" ");
    }
    System.out.println();
    
    }}}