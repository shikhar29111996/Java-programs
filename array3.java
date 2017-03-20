class array3
    {
    public static void main(int a[])
    {
    int i,c=0,j,m=0;
    for(i=1;i<=9;i++)
    {
    c=0;
    for(j=2;j<=a[i]-1;j++)
    {
    if(a[i]%j==0)
    {
    c++;
    }
    }
    if(c==0)
    System.out.println(a[i]);
    }
    }
    }