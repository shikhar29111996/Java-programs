import java.io.*;
class recursion_convert
{
    int n;
    
    recursion_convert()
    {
        n=0;
    }
    
    public void input()throws IOException
    {
        int a,s=0,d=0;
        
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the number");
        n=Integer.parseInt(dr.readLine());

        while(n>0)
        {
            d=n%10;
            s=(s*10)+d;
            n=n/10;
        }
        extdigit(s);
    }
    
    public void extdigit(int a)
    {
        int s;
        if(a>0)
        {
            s=a%10;
            num_to_words(s);
            a=a/10;
            extdigit(a);
        }
    }
    
    public void num_to_words(int b)
    {
        if(b==0)
        {
            System.out.println("zero");
        }
        
        if(b==1)
        {
            System.out.println("one");
        }
        if(b==2)
        {
            System.out.println("two");
        }
        if(b==3)
        {
            System.out.println("three");
        }
        if(b==4)
        {
            System.out.println("four");
        }
        if(b==5)
        {
            System.out.println("five");
        }
        if(b==6)
        {
            System.out.println("six");
        }
        if(b==7)
        {
            System.out.println("seven");
        }
        if(b==8)
        {
            System.out.println("eight");
        }
        if(b==9)
        {
            System.out.println("nine");
        }
    }
    
    public static void main()throws IOException
    {
        recursion_convert h=new recursion_convert();
        h.input();
    }
}