package Inheritence.perimeter_area;

import java.io.*;
class perimeter
{
    protected double a,b;
    
    perimeter(double aa,double bb)
    {
        a=aa;
        b=bb;
    }
    
    double calculate()
    {
        return 2*(a+b);
    }
    
    void show()
    {
        System.out.println("First number->"+a);
        System.out.println("Second number->"+b);
        System.out.println("perimeter->"+calculate());
    }
}