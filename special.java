class special
    {
    boolean number(int n)
    {
    int i,num=n,d=0,s=0,f=1;
    while(n!=0)
    {
    d=n%10;
    for(i=1;i<=d;i++)
    {
    f=f*i;
    }
    s=s+f;
    n=n/10;
    f=1;
    }
    if(num==s)
    return true;
    else
    return false;
    }
    void specialn(int a)
    {
    int i;
    for(i=1;i<=a;i++)
    {
    if(number(i))
    System.out.println(i);
    }}}