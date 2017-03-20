import java.io.*;
class bill
{
public static void main()throws IOException
{
int e;
double s=0;
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the electricity consumed");
e=Integer.parseInt(dr.readLine());
if(e<=100)
s=200;
else if(e>100&&e<=300)
s=((e-100)*1)+200;
else if(e>300&&e<=500)
s=(200*1)+((e-300)*1.55)+200;
else if(e>500)
s=(200*1)+(200*1.55)+((e-500)*2.10)+200;
System.out.println("Total electricity consumed ="+s+"Rs");
}
}