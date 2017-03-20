import java.io.*;
public class table
{
public void func()throws IOException
{
int a,b,i=0,l=0,j,k,t=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any two no.");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
if(a>b)
{
i=b;
l=a;
}
else if(b>a)
{
i=a;
l=b;
}
else
{
System.out.println("Both the no.s are equal");
}
for(j=i+1;j<l;j++)
{
for(k=1;k<=10;k++)
{
t=0;
t=j*k;
System.out.println(j+"x"+k+"="+t);
}
}
}
} 