import java.io.*;
public class q5
{
public void func()throws IOException
{
double t,i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your Gross Annual income");
int gi=Integer.parseInt(br.readLine());
if(gi<=100000)
t=0;
else if(gi>100000&&gi<=150000)
{
i=gi-100000;
t=(10*i)/100;
}
else if(gi>150000&&gi<=200000)
{
i=gi-150000;
t=(20*i)/100+5000;
}
else 
{
i=gi-200000;
t=(30*i)/100+15000;
}
System.out.println("You have to pay Rs"+t+"as tax");
}
}
