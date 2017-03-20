class automorphic
    {
    boolean number(int n)
    {
    int m=n,c;
    double s;
    s=Math.sqrt(n);
    c=m%10;
    if(c==s)
    return true;
    else
    return false;
    }
    void show(int a)
    {
    int i;
    for(i=1;i<=a;i++)
    {
    if(number(i))
    System.out.println(i);
    }}}
    