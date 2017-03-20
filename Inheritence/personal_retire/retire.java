package Inheritence.personal_retire;


import java.io.*;
class retire extends personal
{
    double years,pfa,grta;
    
    retire(double a,double d,double e,String x,String y)
    {
        super(x,y,d,e);
        
        years=a;
        pfa=0;
        grta=0;
        
        
    }

    void prot()throws IOException
    {
        pfa=(2*super.pay*years)/100;
    }
    
    void grot()throws IOException
    {
        if(years>=10.0)
        {
            grta=12*super.pay;
        }
        else 
        grta=0;
    }
    
    void display()throws IOException
    {
        super.show();
        System.out.println("Years of service="+years);
        System.out.println("Profited fund amount="+pfa);
        System.out.println("Grot="+grta);
    }
    
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the name");
        String a=dr.readLine();
        
        System.out.println("Enter the pan number");
        String b=dr.readLine();
        
        System.out.println("Enter the basic pay");
        double c=Double.parseDouble(dr.readLine());
        
        System.out.println("Enter the Account number");
        double d=Double.parseDouble(dr.readLine());
        
        System.out.println("Enter the years of service");
        double e=Double.parseDouble(dr.readLine());
        
        retire r=new retire(e,c,d,a,b);
        
        r.prot();
        r.grot();
        r.display();
    }
}