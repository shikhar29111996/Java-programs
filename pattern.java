class pattern 
    {
    public static void main(int n)
    {
    int i,j=1;
    System.out.print("1"+"+");
    for(i=2;i<=n;i++)
    { 
    System.out.print("(");
    for(j=1;j<=i;j++)
    {
    System.out.print(j);
    if(j>=1&&j<i)
    System.out.print("*");
    }
    System.out.print(")");
    if(i<=n-1)
    System.out.print("+");}}}