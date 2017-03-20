import java.io.*; 
class user_time
{
  public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,l;
System.out.println("enter the no. of users <=100");
int n1=Integer.parseInt(br.readLine());
String n[]=new String[n1];
String d1[]=new String[n1];
String d2[]=new String[n1];
String t1[]=new String[n1];
String t2[]=new String[n1];
double th[]=new double[n1];
double tm[]=new double[n1];
for(i=0;i<n1;i++)
{
System.out.println("enter the user no.");
n[i]=br.readLine();
System.out.println("enter the login &loggout date in format=dd-mm");
d1[i]=br.readLine();
d2[i]=br.readLine();
System.out.println("enter the login &loggout time in format=hh-mm");
t1[i]=br.readLine();
t2[i]=br.readLine();
}
for(i=0;i<n1;i++)
{String tmpd1="",tmpd2="",tmpt1="",tmpt2="",tmpm1="",tmpm2="";
for(j=0;j<4;j++)
{
char ch=d1[i].charAt(j);
if(ch!='-')
tmpd1=tmpd1+ch;
if(ch=='-')
break;
}
for(j=0;j<4;j++)
{
int ch=d2[i].charAt(j);
if(ch!='-')
tmpd2=tmpd2+ch;
if(ch=='-')
break;
}
for(j=0;j<4;j++)
{
int ch=t1[i].charAt(j);
if(ch!=':')
tmpt1=tmpt1+ch;
if(ch==':')
break;
}
for(j=0;j<4;j++)
{
int ch=t2[i].charAt(j);
if(ch!=':')
tmpt2=tmpt2+ch;
if(ch==':')
break;
}
for(j=4;j>0;j--)
{
int ch=t1[i].charAt(j);
if(ch!=':')
tmpm1=tmpm1+ch;
if(ch==':')
break;
}

for(j=4;j>0;j--)
{
char ch=t2[i].charAt(j);
if(ch!=':')
tmpm2=tmpm2+ch;
if(ch==':')
break;
}
if((Integer.parseInt(tmpd2)-Integer.parseInt(tmpd1))>=1)
{
th[i]=Integer.parseInt(tmpt1)+Integer.parseInt(tmpt2);
tm[i]=Integer.parseInt(tmpm1)+Integer.parseInt(tmpm2);
}
else
{
th[i]=Integer.parseInt(tmpt1)-Integer.parseInt(tmpt2);
tm[i]=Integer.parseInt(tmpm1)-Integer.parseInt(tmpm2);
}
}
for(i=0;i<n1;i++)
{
for(j=0;j<(n1-1);j++)
{
if(th[j]>th[j+1])
{
double tmp=th[j];
th[j]=th[j+1];
th[j+1]=tmp;

String tmp1=n[j];
n[j]=n[j+1];
n[j+1]=tmp1;
}
}
}
for(i=0;i<n1;i++)
{
for(j=0;j<(n1-1);j++)
{
if(tm[j]>tm[j+1])
{
double tmp2=tm[j];
tm[j]=tm[j+1];
tm[j+1]=tmp2;

double tmp=th[j];
th[j]=th[j+1];
th[j+1]=tmp;

String tmp1=n[j];
n[j]=n[j+1];
n[j+1]=tmp1;
}
}
}
System.out.println("*******\nuser"+n[n1-1]+"\n*******");
    System.out.println("time duration="+th[n1-1]+"hrs"+tm[n1-1]);
}

}





















