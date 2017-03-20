import java.io.*;
public class function
{
public void func()throws IOException
{
double a,b=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 1 for absolute value");
System.out.println("Enter 2 for round off value");
System.out.println("Enter 3 for double value in integer type ");
System.out.println("Enter 4 for trigonometrical ratios");
int n=Integer.parseInt(br.readLine());
switch (n)
{
case 1:
System.out.println("Enter the no.");
a=Double.parseDouble(br.readLine());
b=Math.abs(a);
break;
case 2:
System.out.println("Enter the no.");
a=Double.parseDouble(br.readLine());
b=Math.round(a);
break;
case 3:
System.out.println("Enter the no.");
a=Double.parseDouble(br.readLine());
b=Math.rint(a);
break;
case 4:
System.out.println("Enter the angle");
a=Double.parseDouble(br.readLine());
System.out.println("Enter 1 for sin of angle,2 for cos of angle,3 for tan of angle");
int c=Integer.parseInt(br.readLine());
switch (c)
{
case 1:
b=Math.sin(a);
break;
case 2:
b=Math.cos(a);
break;
case 3:
b=Math.tan(a);
break;
}
default :
System.out.println("Wrong Choice");
}
System.out.println("The value is = "+b);
}
}