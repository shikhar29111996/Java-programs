class alphabet1
    {
    public static void main(int n)
    {
    int i,j,a,k;
    char b='a';
    for(i=1;i<=n;i++)
    {
    for(a=n-1;a>=i;a--)
    {
    System.out.print(" ");
    }
    for(j=1;j<=i;j++)
    {
    System.out.print(b);
    b++;
    }
    if(i>1)
    {
    for(k=1;k<=i-1;k++)
    {
    System.out.print(b);
    b++;
    }
    }
    System.out.println();
    }}}