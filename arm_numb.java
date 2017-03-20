import java.io.*;
class arm_numb
{
    long number;
    
    arm_numb()
    {
        number=0;
    }
    
    arm_numb(long n)
    {
        number =n;
    }
    
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        
        
        System.out.println("enter the number");
        long n=Long.parseLong(dr.readLine());
        
        arm_numb a=new arm_numb(n);
        
        boolean t1=a.armstrong();
        boolean t2=a.armstronglike();
        
        if(t1==true)
        System.out.println("armstrong");
        if(t1==true)
        a.genarmstrong();
        if(t2==true)
        System.out.println("armstrong like");
        if(t2==true)
        a.genarmstronglike();
    }
    
    public boolean armstrong()
    {
        long n=number;
        long s=0,d;
        
        while(n!=0)
        {
            d=n%10;
            s=s+(d*d*d);
            n=n/10;
        }
        
        if(s==number)
        {
            return true;
        }
        
        else
        return false;
    }
    
    public boolean armstronglike()
    {
        long n=number;
        double d,i,s=0,x;
        int c=0;
        
            while(n!=0)
            {
                c++;
                n=n/10;
            }
        
            n=number;
            x=c/3;
          
            for(i=1;i<=3;i++)
            {
                d=n%(int)(Math.pow(10,x));
                s=s+(d*d*d);
                n=n/(int)(Math.pow(10,x));
            }
            
        if(s==number)
        return true;
          
        else
        return false;
    }
    
    public void genarmstrong()
    {
        int i;
        for(i=1;i<number;i++)
        {
           int n=i,d,s=0;
            while(n!=0)
        {
            d=n%10;
            s=s+(d*d*d);
            n=n/10;
        }
        
        if(s==i)
        {
            System.out.println(s);
        }
    }
}
    
    public void genarmstronglike()
    {
        int i,j;
        for(i=100000;i<999999;i++)
        {
            int n=i,c=0,x;
            double d,s=0;
            while(n!=0)
            {
                c++;
                n=n/10;
            }
        
            n=i;
            x=c/3;
          
            for(j=1;j<=3;j++)
            {
                d=n%(int)(Math.pow(10,x));
                s=s+(d*d*d);
                n=n/(int)(Math.pow(10,x));
            }
            
        if(s==i)
        System.out.println(s);
    }
}
}