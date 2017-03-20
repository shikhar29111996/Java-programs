import java.io.*;
public class rint
{
public void func()throws IOException
{
double i,r;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
for(int k=1;k<=100000;k++)
{
System.out.println("enter a number");
i=Double.parseDouble(br.readLine());
r=Math.rint(i);
System.out.println(r);
if(i==100)
break;
}
}
}