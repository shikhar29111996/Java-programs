import java.io.*;
class temprature
{
double s;
public double temp(double f)
{
s=(5*(f-32))/9;
System.out.println(s);
return s;
}
public double temp(int c)
{
s=((9*c)/5)+32;
System.out.println(s);
return s;
}
public static void main()throws IOException
{
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
temprature ee=new temprature();
int ch;
System.out.println("1-to convert farhenhieht to celsius");
System.out.println("2-to convert celsius to farhenhieght");
System.out.println("3-to exit");
System.out.println("enter your choice");
ch=Integer.parseInt(dr.readLine());
switch(ch)
{
case 1:
System.out.println("Enter the degree farhenhieght");
double f=Double.parseDouble(dr.readLine());
ee.temp(f);
break;
case 2:
System.out.println("Enter the degree celsius");
double c=Double.parseDouble(dr.readLine());
ee.temp(c);
break;
case 3:
System.exit(0);
break;
default:
System.out.println("wrong choice");
}
}
}
