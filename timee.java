import java.io.*;
public class timee
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
if(min==0)
{
if(hr>12)
{
hr=hr-12;
st=a[hr]+"o clock";
System.out.println("time is "+st);	
}
else if(hr<=12)
st=a[hr]+"o clock";
System.out.println("time is "+st);	
}
else
if(min<30)
{
if(min==15)
{
st="quarter past"+a[hr];
System.out.println("time is "+st);
}
else
if(min==30)
{
st="half past"+a[hr-1];
System.out.println("time is "+st);
}
else
System.out.println(a[min]+" min to "+a[hr]);
}
if(min>30)
{
if(min==45)
{
st="quarter to "+a[hr];
System.out.println("time is "+st);
}
else
if(min>45||min<45&&min>30)
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
}

