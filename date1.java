import java.io.*;
public class date1
{
public void get()throws IOException
{
int s=0,x=0,d=0,di=0,sum=0;
int a[]={31,x,31,30,31,30,31,31,30,31,30,31} ;

BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
System.out.println("Enter two dates and then two month of o similar year by pressing enter ");
int d1=Integer.parseInt(br.readLine());
int m=Integer.parseInt(br.readLine());
int y=Integer.parseInt(br.readLine());
int d2=Integer.parseInt(br.readLine());
int m1=Integer.parseInt(br.readLine());
if(y%4==0)
x=29;
else 
x=28;
for(int j=m;j<m1;j++)
s=s+a[j];
d=a[m-1]-d1;
sum=s+d+d2-1;
System.out.println("difference ="+sum);
}
}

