class perfect
    {
    boolean main(int n)
    {
    int i,c=0;
    for(i=1;i<n;i++)
    {
    if(n%i==0)
    c=c+i;
    }
    if(c==n)
    return true;
    else
    return false;
    }
    void show(int a)
    {
    int i;
    for(i=1;i<=a;i++)
    {
    if(main(i))
    System.out.println(i);
    }}}