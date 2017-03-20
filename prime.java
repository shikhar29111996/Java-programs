class prime
    {
    boolean main(int n)
    {
    int i,c=0;
    for(i=2;i<=n-1;i++)
    {
    if(n%i==0)
    c++;
    }
    if(c==0)
    return true;
    else
    return false;
    }
    void prime(int a)
    {
    int i;
    for(i=1;i<=a;i++)
    {
    if(main(i))
    System.out.println(i);
    }}}