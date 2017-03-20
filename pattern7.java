class pattern7
    {
    public static void main()
    {
    int c=0,k,m,i,j,a;
    for(i=5;i>=1;i--)
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
    }
    for(i=2;i<=5;i++)
    {
    for(j=1;j<=i;j++)
    {
    System.out.print(j);
    }
    if(i>=1)
    {
    for(k=i+1;k>1;k=k-2)
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
    }
    }
    }