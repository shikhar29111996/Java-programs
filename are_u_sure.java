import java.io.*;
class are_u_sure
{

public static void hh()throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String s="";
int i,as=0,f=0,j,ln=0,c=0,k=0;
String sub="",res="",t="";
char ch,ch2;
do{
System.out.println("Enter a sentenco(should be separated by space) - ");
s=br.readLine();
ln=s.length();
for(i=0;i<s.length()-1;i++)
{
ch=s.charAt(i);
as=(int)(ch);
if((as<65||as>90)&&as!=32)
f=1;
if(as==32&&((int)(s.charAt(i+1))==32))
f=1;
ch2=s.charAt(ln-1);
if(ch2!='.'&&ch2!='!'&&ch2!='?')
f=1;
}
if(f==1)
{
f=0;
continue;
}
else
break;

}while(true);


//counting no. of words
for(i=0;i<s.length()-1;i++)
{
ch=s.charAt(i);
if(ch==' ')
c++;
}
c=c+1;

String a[]=new String[c];

for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch!=' '&&ch!=s.charAt(ln-1))
sub=sub+ch;
else
{
a[k++]=sub;
sub="";
}
}
for(i=0;i<a.length;i++)
System.out.println(a[i]);

//sorting
for(i=0;i<a.length;i++)
{
for(j=0;j<a.length-1-i;j++)
{
if(a[j].compareTo(a[j+1])>0)
{
t=a[j+1];
a[j+1]=a[j];
a[j]=t;
}
}
}

for(i=0;i<a.length;i++)
res=res+a[i];




System.out.println(res);
}
}



































