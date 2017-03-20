class pattern4
    {
    public static void main(int n)
    {
    int c=0,k,m,i,j;
    
    for(i=n;i>=1;i--)
    {
    for(j=1;j<=i;j++)
    {
    System.out.print(j);
    }
    if(i>=1)
    {
    for(k=1;k<=c;k++)
    {
    System.out.print(" ");
    }
    for(m=i;m>=1;m--)
    {
    System.out.print(m);
    }
    c=c+2;
    System.out.println();
    }
    }}}