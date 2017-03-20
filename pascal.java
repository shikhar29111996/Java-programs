class pascal
{
public void get()
{
int i,b=0,c,d,x,y,z,j;
int a[]=new int[10];
for(i=0;i<=9;i++)
{
b=a[i];
for(j=0;j<=b;j++)
{
if(j<0)
{
x=a[j];
y=a[j-1];
z=x+y;
System.out.println(z+" ");
}
}
}
}
}