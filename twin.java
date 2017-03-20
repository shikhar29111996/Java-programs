class twin
{
public static void main()
{
int i,j,k,a,b,c=0,d=0,z;
for(i=1;i<=100000;i++)
{
a=i;
b=i+2;
c=0;
d=0;
for(j=1;j<=a;j++)
{
if(a%j==0)
c++;
}
for(k=1;k<=b;k++)
{
if(b%k==0)
d++;
}
if(c==2&&d==2)
System.out.println(a+" "+b);
}
}
}