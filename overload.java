import java.io.*;
class overload
{
static double ar;
public void area(double r)throws IOException
{
ar=(Math.PI)*4*r*r;
}
public void area(int l,int b,int h)
{
ar=2*((l*b)+(b*h)+(h*l));
}
public void area(int a)
{
ar=(Math.sqrt(3)*a*a)/4;
}
public static void main(String args[])throws IOException
{
int s,n,x,y,z;
double p;
overload obj=new overload();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 1 for area of sphere");
System.out.println("Enter 2 for surface area of square");
System.out.println("Enter 3 for area of an equilateral");
n=Integer.parseInt(br.readLine());
if(n==1)
{
System.out.println("enter the radius");
p=Double.parseDouble(br.readLine());
obj.area(p);
}
else if(n==2)
{
System.out.println("enter the length breadth and height");
x=Integer.parseInt(br.readLine());
y=Integer.parseInt(br.readLine());
z=Integer.parseInt(br.readLine());
obj.area(x,y,z);
}
else if(n==3)
{
System.out.println("enter the side");
s=Integer.parseInt(br.readLine());
obj.area(s);
}
System.out.println("ans="+ar);
}
}

