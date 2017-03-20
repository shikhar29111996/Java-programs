class recursion_fabonici
{
int a=0,b=1;

    public void fab()
    {
        if(a<=1000)
        {
            System.out.print(a+",");
            if(b<=1000)
            {
                System.out.print(b+",");
                }
            a=a+b;
            b=b+a;
            fab();
            
        }
    }
}