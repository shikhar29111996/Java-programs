import java.io.*;
public class date1_3
{
public static void main()throws IOException
{
int month1;
int day1;
int dn[]={31,28,31,30,31,30,31,31,30,31,30,31};
int dl[]={31,29,31,30,31,30,31,31,30,31,30,31};
int h=0;
while(true)
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the date");
String s=br.readLine();
int l=s.length();
int i1=s.indexOf('/');
int i2=s.lastIndexOf('/');
String day=s.substring(0,i1);
String month=s.substring(i1+1,i2);
String year=s.substring(i2+1,l);
int flag=0;
if((year.length())!=4)
flag=1;
month1=Integer.parseInt(month);
day1=Integer.parseInt(day);
if(month1<1 || month1>12)
{
flag=1;
continue;
}
if(day1>dn[month1-1])
flag=1;
if(flag==1)
{
System.out.println("The Date is Invalid. Please Enter again");
continue;
}
else
{
System.out.println("Date is Valid");
break;
}
}
int ch=0;
for(int i=0;i<month1-1;i++)
{
ch=ch+dn[i];
}
ch=ch+day1;
System.out.println("The day no is = "+ch);
}
}
