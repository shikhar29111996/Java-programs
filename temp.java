import java.io.*;
public class temp
{
static double c;
public static double temp(float t)throws IOException
{
c=(5*(t-32))/9;
System.out.println(c);
return c;
}
public static double temp(double te)throws IOException
{
c=((9*te)/5)+32;
System.out.println(c);
return c;
}
public static void main(String args[])throws IOException
{
temp obj=new temp();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 1 for conversion of f to c or Enter 2 for conversion of c to f");
int ch=Integer.parseInt(br.readLine());
switch (ch)
{
case 1:
System.out.println("Enter the temperature in fahrenheit");
float t=Float.parseFloat(br.readLine());
obj.temp(t);
break;
case 2:
 System.out.println("Enter the temperature in celsius");
double te=Double.parseDouble(br.readLine());
obj.temp(te);
break;
}
}
}
