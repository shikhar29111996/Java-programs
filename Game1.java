import java.io.*;
class Game1
{
public static void main()throws IOException
{
int a,b,i;
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
double c=(50*Math.random());
b=(int)c;
System.out.println("The Game Begins");
System.out.println("U will get only 3 chances");
for(i=1;i<=3;i++)
{
System.out.println("Enter the no u think number");
a=Integer.parseInt(dr.readLine());
if(a==b)
{
System.out.println("You are a winner"+"\n"+"U earn Rs..1000");
break;
}
else if(a<b)
System.out.println("You are below the number");
else if(a>b)
System.out.println("You are above the number");
if(i==3)
System.out.println("Chances are over"+"\n"+"Sorry"+"\n"+"Correct answer is"+b);
}
}
}