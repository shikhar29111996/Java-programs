class reverse
{
    public static void main(int a)
    {
        int d=0,s=0;
        while(a>0)
        {
            d=a%10;
            s=(s*10)+d;
            a=a/10;
        }
        System.out.println(s);
    }
}