class ascending
    {
    public void main(int n)
    {
int i,a=n,b,c,d;
    for(i=1;i<=9;i++)
    {
    while(n!=0)
    {
    b=n%10;
    if(b==i)
    System.out.println(i);
    n=n/10;
    }
    n=a;
    }
    }}