import java.io.*;
class twinp
{
public int  prime(int k)
{
int c=0,i;
for(i=1;i<=k;i++)
{
if(k%i==0)
c++;
}
return c;
}
public void work()throws IOException
{
InputStreamReader is=new InputStreamReader (System.in);
	BufferedReader br=new BufferedReader(is);
	
	int a=0,b=0,left=0,right=0,com=0,n2=0,n=0;
	System.out.println("Mai....Mai Kyaa ..");
	n=Integer.parseInt(br.readLine());
	n2=n;

while(true)
{

com=--n;
a=prime(com);
if(a==2)
b=prime(com-2);
else
continue;
if(b==2)
{
left=com;
break;
}
else
continue;
}

while(true)
{

com=++n;
a=prime(com);
if(a==2)
b=prime(com+2);
else
continue;
if(b==2)
{
right=com;
break;
}
else
continue;
}

if((n2-left)<(right-n2))
System.out.println(left+"  "+(left-2));
else
System.out.println(right+"  "+(right+2));
}
}
















