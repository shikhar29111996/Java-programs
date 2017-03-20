class palindrom
    {
    boolean number(int n)
    {
    int i,d=0,r=0,num=n;
    while(n!=0)
    {
    d=n%10;
    r=r*10+d;
    n=n/10;
    }
    if(r==num)
    return true;
    else
    return false;
    }
    void palindrome(int a)
    {
    int i;
    for(i=1;i<=a;i++)
    {
    if(number(i))
    System.out.println(i);
    }}}