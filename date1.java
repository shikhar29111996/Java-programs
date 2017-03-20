import java.util.*;
class date1
{
int d,m,y,f=0;
String date;
int monthleap[]={31,29,31,30,31,30,31,31,30,31,30,31};
int monthnormal[]={31,28,31,30,31,30,31,31,30,31,30,31};
public void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the date in dd/mm/yyyy");
date=sc.next();
}
public void extract()
{
StringTokenizer st=new StringTokenizer(date,"/");
d=Integer.parseInt(st.nextToken());
m=Integer.parseInt(st.nextToken());
y=Integer.parseInt(st.nextToken());
}
public void validity()
{
if(y!=0)
{
if(m<=12&&m>0)
{
if(y%4==0)
{
if(d<=monthleap[m-1])
f=1;
}
else if(y%4!=0)
{
if(d<=monthnormal[m-1])
f=1;
}
}
}
if(f==1)
System.out.println("the date is valid");
else
System.out.println("the date is not valid");
}
public void main()
{
input();
extract();
validity();
}
}
