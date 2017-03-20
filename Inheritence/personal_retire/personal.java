package Inheritence.personal_retire;

import java.io.*;
class personal
{
    protected double pay,acc;
    protected String name,pan;
    
    personal(String a,String b,double c,double d)
    {
        name=a;
        pan=b;
        pay=c;
        acc=d;
    }
    
    void show()
    {
        System.out.println("\n \n \n");
        System.out.println("Name="+name);
        System.out.println("Pan number="+pan);
        System.out.println("Monthly salary="+pay);
        System.out.println("Account Number="+acc);
    }
}