import java.io.*;         
public class s
{
public void func()throws IOException
{
int a,b,c=0,d=0,i,j;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter two no. for checking whether it is twin prime");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
for(i=2;i<a;i++)
{
if(a%i==0)
break;
else
c=a;
}
for(j=2;j<b;j++)
{
if(b%j==0)
break;
else
d=b;
}
if(c==0||d==0)
System.out.println("no. is not twin prime");
else
{
if(a-b==2||b-a==2)
System.out.println("no. is  twin prime");
}
}
}
