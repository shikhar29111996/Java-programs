import java.io.*;
public class patterrn1234
{
public void func()throws IOException
{
int i,j,s;
for(i=1;i<=9;i++)
{
s=0;
for(j=1;j<=i;j++)
{
s=s+i;
System.out.print(s+" ");
}
System.out.println();
}
}
}
