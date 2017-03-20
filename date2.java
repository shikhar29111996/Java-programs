import java.io.*;
public class date2
{
public void get()throws IOException
{
int c=0,s=0,i,f,p=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the year");
int y=Integer.parseInt(br.readLine());
if(y%4==0)
f=29;
else
f=28;
int a[]={31,f,31,30,31,30,31,31,30,31,30,31};
System.out.println("Enter two dates and then two month of o similar year by pressing enter ");
int d1=Integer.parseInt(br.readLine());
int m=Integer.parseInt(br.readLine());
int d2=Integer.parseInt(br.readLine());
int m1=Integer.parseInt(br.readLine());
if(m==m1)
s=d2-d1;
else
{
for(i=m;i<m1-1;i++)
{
c=c+a[i];
}
p=a[m-1]-d1;
s=p+c+d2;
}
System.out.println("days are="+s);
}
}

