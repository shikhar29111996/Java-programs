class happy
    {
    public static void main(int n)
    {
    int a=n,d,c=0,m=0,i;
    for(i=1;i<n;i++)
    {
    m=0;
    c=0;
    d=0;
    while(n!=0)
    {
    d=n%10;
    c=d*d;
    m=m+c;
    n=n/10;
    }
    n=m;
    }
    if(m==1)
    System.out.println("it is a happy number");
    else
    System.out.println("it is not a happy number");
    }}
    