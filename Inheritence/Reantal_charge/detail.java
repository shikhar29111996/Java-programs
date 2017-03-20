package Inheritence.Reantal_charge;

import java.io.*;
class detail
{
    protected String name,address;
    protected int telno,rent;
    
    detail(String aa,String bb,int cc,int dd)
    {
        name=aa;
        address=bb;
        telno=cc;
        rent=dd;
    }
    
    void show()
    {
        System.out.println("Name->"+name);
        System.out.println("Address->"+address);
        System.out.println("Telephone number->"+telno);
        System.out.println("rental charge->"+rent);
    }
}