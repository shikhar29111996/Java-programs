import java.io.*;
class qayamat
{
public static void main(int a,int b)
{
qayamat ob=new qayamat();

for(i=1;i<=Math.abs(b);i++)
{
int res=ob.pow(a,i);
sum=sum+res;
}
if(b<0)
System.out.println(1.0/(double)(res));
else
System.out.println(res);
}

public static int pow(int n,int m)
{
if(m>0)
return n*pow(n,--m);
else
return 1;
}
}



