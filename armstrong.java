class armstrong
    {
    boolean number(int n)
    {
    int i,num=n,d=0,s=0;
    while(n!=0)
    {
    d=n%10;
    s=s+(d*d*d);
    n=n/10;
    }
    if(num==s)
    return true;
    else
    return false;
    }
    void yesh(int a)
    {
    int i;
    for(i=1;i<=a;i++)
    {
    if(number(i))
    System.out.println(i);
    }}}