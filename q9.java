import java.io.*;
public class q9

{
public void func()throws IOException
{
int age ,p;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your sex Mfor male &F for female");
String q=br.readLine();
char s=q.charAt(0);
System.out.println("Enter your age");
age=Integer.parseInt(br.readLine());
if(s=='m')
{
if(age>=65&&age<70)
p=50;
else if(age>=70)
p=70;
else
p=0;
}
 else
 {
 if(age>=60&&age<65)
 p=45;
 else if(age>=65)
 p=60;
 else
 p=0;
 }
 System.out.println("You would get Rs"+p+"a week");
}
}