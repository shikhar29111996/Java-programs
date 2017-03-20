class arm
    {
    public void main()
    {
    int i,n,d,s=0,f=1,j;
    for(i=1;i<=500;i++)
    {
    n=i;
    while(n!=0)
    {d=n%10;
    s=s+d*d*d;
    n=n/10;}
    if(i==s)
    System.out.println(i);
    s=0;
    n=0;
    f=1;
    d=0;
    }
    }
    }
    