import java.io.*;
public class diamond
{
public void func()throws IOException
{
int i,j,sp,a=1,b=1,c=0,l;
for(i=1;i<=9;i++)
{
for(sp=4;sp>=a;sp--)
System.out.print(" ");
for(j=1;j<=b;j++)
System.out.print(j);
for(l=j-2;l>=1;l--)
System.out.print(l);
if(i>4)
{
a--;
b--;
}
else
{
a++;
b++;
}
System.out.println();
}
}
}