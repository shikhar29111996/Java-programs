import java.io.*;
public class kuk

{
public void func()throws IOException
{
int gi,t,i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your salary");
gi=Integer.parseInt(br.readLine());
if(gi<=100000)
t=0;
else if(gi>100000&&gi<=150000)
{
i=gi-100000;
t=(10/100)*i;
}
else if(gi>150000&&gi<=200000)
{
i=gi-150000;
t=5000+(20/100)*i;
}
else 
{
i=gi-200000;
t=150000+(30/100)*i;
}
System.out.println("You have to pay Rs"+t+"as tax");
}
}
