import java.io.*;
public class string1
{
public void func()throws IOException
{char s;
String r,s2="",s1="";
int ch,i,c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a string");
r=br.readLine();
System.out.println("Enter 1 for charAt functn or 2 for substringfunctn");
ch=Integer.parseInt(br.readLine());
c=r.length();
switch(ch)
{
case 1:
for(i=0;i<c;i++)
{
s=r.charAt(i);
s2=s+s2;
}
break;
case 2:
for(i=0;i<c;i++)
{
s1=r.substring(i,i+1);
s2=s1+s2;
}
break;
}
System.out.println(s2);
}
}
