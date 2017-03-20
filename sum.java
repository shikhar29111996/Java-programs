class sum
    {
    public static void main(int n)
    {
    int i,j=0,fact=1;
    for(i=1;i<=n;i++)
    {
    fact=fact*i;
    j=j+fact;
    }
    System.out.println(j);
    }}