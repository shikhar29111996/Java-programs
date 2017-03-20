import java.util.*;
class pascal_2
{
protected static void main()throws Exception 
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the limit: ");
byte a=sc.nextByte();
sc.close();
String l[]=new String[a];
for(byte i=0;i<a;i++)
l[i]="";
l[0]="1";
l[1]="1 1";
for(byte i=2;i<a;i++)
{
for(byte j=0;j<(i+1);j++)
{
if(j==0||j==i)
l[i]+="1 ";
else
{
StringTokenizer st=new StringTokenizer(l[i-1]);
byte k=(byte)st.countTokens(),n=0;
String w[]=new String[k];
for(byte f=0;f<w.length;f++)
w[f]="";
for(byte f=0;f<l[i-1].length();f++)
{
if(l[i-1].charAt(f)==' ')
{
n++;
continue;
}
w[n]+=l[i-1].charAt(f);
}
n=0;
int x=Integer.parseInt(w[j-1])+Integer.parseInt(w[j]);
l[i]+=(String.valueOf(x)+" ");
}
}
}
for(byte i=0;i<l.length;i++)
{
System.out.println();
for(byte j=a;j>=i;j--)
System.out.print(" ");
for(byte j=0;j<l[i].length();j++)
System.out.print(l[i].charAt(j));
}
}
}