import java.io.*;
public class tymm
{
public void shw()throws IOException
{
int p=0,l,o;String t=" ",m=" ",st=" ";
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String a[]={"one","two","three", "four", "five", "six", "seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nintn","twenty","twenty-one","twenty-two","twenty-three","twenty-four","twenty-five","twenty-six","twenty-seven","twenty-eight","twenty -nine"};
System.out.println("input the 2 no. ");
String s=br.readLine();
s=s+",";
l=s.length();
o=s.indexOf(',');
t=s.substring(p,o);
m=s.substring(o+1,l-1);
int hr=Integer.parseInt(t);
int min=Integer.parseInt(m);
System.out.println("time is "+t+":"+m);
if(min==0&&hr<12)
{
st=a[hr]+"o clock";
System.out.println("time is "+st);
}
else
if(((min>=1&&min<=14)||(min>=16&&min<=29))&&hr<12)
{
st=a[min]+"min past"+a[hr];
System.out.println("time is "+st);
}

else
if(min==15&&hr<=12)
{
st="quarter past"+a[hr];
System.out.println("time is "+st);
}
else
if(min==30&&hr<=12)
{
st="half past"+a[hr-1];
System.out.println("time is "+st);
}
else
if(min==45&&hr<=12)
{
st="quarter to "+a[hr];
System.out.println("time is "+st);
}
else
if((min>=31&&min<=44)&&hr<=12)
{
st=a[(60-min)-1]+"min to"+a[hr];
System.out.println("time is "+st);
}
else
if(min>=46)
{
hr=hr+1;
if(hr>12)
{
hr=hr-12;
st=a[(60-min)-1]+"min to"+a[hr-1];
System.out.println("time is "+st);
}
else
{
st=a[(60-min)-1]+"min to"+a[hr-1];
System.out.println("time is "+st);
}
}
}
}
