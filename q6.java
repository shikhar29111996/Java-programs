import java.io.*;
public class q6
{
public void func()throws IOException
{double d,f;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the no. of days");
d=Integer.parseInt(br.readLine());
if(d<=5)
f=(40*d)/100;
else if(d>=6&&d<10)
 f=(65*d)/100;
 else 
 f=(80*d)/100;
 System.out.println("You have to pay Rs"+f+"as fine");
  }
 }
                                                                                                                                                               