class magic
    {
    public static void main(int n)
    {
    int a=n,d,s,c=0,b,i;
    for(i=1;i<=n;i++)
    {
    c=0;
    while(n!=0)
    {
    d=n%10;
    c=c+d;
    n=n/10;
    }
    n=c;
    }
    if(c==1)
    {
    System.out.println("it is a magic number");
    }
    else
    {
    System.out.println("it is not a magic number");
    }
    }
    }