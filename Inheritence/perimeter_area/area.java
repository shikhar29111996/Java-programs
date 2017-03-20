package Inheritence.perimeter_area;


import java.io.*;
class area extends perimeter
{
    double h,area;
    
    area(double aa,double bb,double cc)
    {
        super(aa,bb);
        h=cc;
    }
    
    void cal()
    {
        area=h*super.b;
    }
    
    void show()
    {
        super.show();
        System.out.println("Height->"+h);
        System.out.println("Area->"+area);
    }
    
    public static void main(String agrs[])throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the length");
        int aa=Integer.parseInt(dr.readLine());
        
        System.out.println("enter the breath");
        int cc=Integer.parseInt(dr.readLine());
        
        System.out.println("enter the height");
        int bb=Integer.parseInt(dr.readLine());
        
        area a=new area(aa,bb,cc);
        a.cal();
        a.show();
    }
}