import java.io.*;         
public class twin_prime
{
public void func()throws IOException
{
int a,b,c=0,d=0,i,j,k;
for(k=1;k<=100;k++)
{a=k;
b=k+2;
for(i=2;i<a;i++)
{
if(k%i==0)
{
c=0;
break;
}
else
c=a;
}
for(j=2;j<b;j++)
{
if(b%j==0)
{
d=0;
break;
}
else
d=b;
}
if(a>0&&b>0)
System.out.println(c+","+d+"are twin pirme");
System.out.println();
}
}
}



