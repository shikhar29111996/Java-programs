class twin
{
public void series()
{
int i,j,c=0,d=0,e,f;
for(i=1;i<=100;i++)
{
e=i;
for(j=1;j<=e;j++)
{
if(e%j==0)
c++;
}
f=i+2;
for(j=1;j<=f;j++)
{
if(f%j==0)
d++;
}
if(d==2&&c==2)
System.out.println(e+","+f);
c=0;
d=0;
}
}
}