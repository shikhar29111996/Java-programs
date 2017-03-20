package Inheritence.Reantal_charge;

import java.io.*;
class bill extends detail
{
    int n;
    double amt;
    
    bill(String aa,String bb,int cc,int dd,int ee)
    {
        super(aa,bb,cc,dd);
        n=ee;
        amt=0;
    }
    
    void cal()
    {
        if(n>=1&&n<100)
        amt=super.rent;
        
        if(n>=100&&n<200)
        amt=super.rent+(n*0.60);
        
        if(n>=200&&n<300)
        amt=super.rent+(n*0.80);
        
        if(n>=300)
        amt=super.rent+n;
    }
    
    void show()
    {
        super.show();
        System.out.println("Net Amount->"+amt);
    }
    
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the name");
        String aa=dr.readLine();
        
        System.out.println("enter the address");
        String bb=dr.readLine();
        
        System.out.println("enter the telephone number");
        int cc=Integer.parseInt(dr.readLine());
        
        System.out.println("enter the rental charge");
        int dd=Integer.parseInt(dr.readLine());
        
        System.out.println("enter the number of calls");
        int ee=Integer.parseInt(dr.readLine());
        
        bill d=new bill(aa,bb,cc,dd,ee);
        
        d.cal();
        d.show();
    }
}