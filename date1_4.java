import java.io.*;
 class date1_4
{
   public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String date,day,mon,year;int d,m,y,c=0,i,s=0;
int da[]={0,31,28,31,30,31,30,31,31,30,31,30,31};



while(true)
{
System.out.println("enter the date in format dd/mm/yyyy");
date=br.readLine();

day=date.substring(0,date.indexOf('/'));
mon=date.substring((date.indexOf('/')+1),date.lastIndexOf('/'));
year=date.substring(date.lastIndexOf('/')+1);

d=Integer.parseInt(day);
m=Integer.parseInt(mon);
y=Integer.parseInt(year);

if(y%4==0)
da[2]=29;
    if(year.length()<4)
    {
System.out.println("re-enter the date in format dd/mm/yyyy");
continue;
}

 if(m<1||m>12)
{
System.out.println("re-enter the date in format dd/mm/yyyy");
continue;
}
 else   if(d<1||d>da[m])
{
System.out.println("re-enter the date in format dd/mm/yyyy");
continue;
}
else if(y==0)
{
System.out.println("re-enter the date in format dd/mm/yyyy");
continue;
}
else 
{
System.out.println("valid date");c=1;break;
}
}
if(c==1)
{
for(i=1;i<m;i++)
{
s=s+da[i];
}
System.out.println("the day no.="+(s+d));
}
}
}
















