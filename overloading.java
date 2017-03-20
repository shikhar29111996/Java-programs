import java.io.*;
class overloading
{
double v;
public double volume(int r)
{
v=(4*22*r*r*r)/(3*7);
System.out.println("Volume of sphere is ="+v+" unit");
return v;
}
public double volume(int r,int h)
{
v=(22*r*r*h)/(3*7);
System.out.println("Volume of cone is="+v+"unit");
return v;
}
public double volume(int l,int b,int h)
{
v=l*b*h;
System.out.println("Volume of cuboid is="+v+"unit");
return v;
}
public static void main()throws IOException
{
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
int ch;
overloading ee=new overloading();
System.out.println("1-volume of sphere");
System.out.println("2-volume of cone");
System.out.println("3-volume of cuboid");
System.out.println("4-to exit");
System.out.println("enter your choice");
ch=Integer.parseInt(dr.readLine());
switch(ch)
{
case 1:
int r,h;
System.out.println("Enter radius and height");
r=Integer.parseInt(dr.readLine());
ee.volume(r);
break;
case 2:
int r1,h1;
System.out.println("enter radius and height");
r1=Integer.parseInt(dr.readLine());
h1=Integer.parseInt(dr.readLine());
ee.volume(r1,h1);
break;
case 3:
int a,b,c;
System.out.println("Enter the length,breadth,height");
a=Integer.parseInt(dr.readLine());
b=Integer.parseInt(dr.readLine());
c=Integer.parseInt(dr.readLine());
ee.volume(a,b,c);
break;
case 4:
System.exit(0);
break;
default:
System.out.println("Wrong choice");
}
}
}