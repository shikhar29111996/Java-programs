public class differ
{
public void func()
{
int i,j,d,z=6,s;
int b[]={2,6,12,20,30,42};
for(i=0;i<6;i++)
{
int a[]=new int[z];
for(j=0;j<z;j++)
{
a[j]=b[j];
System.out.print(a[j]+" ");
}
z--;
for(j=0;j<z;j++)
{
if(j<5)
{
s=a[j+1]-a[j];
b[j]=s;
}
}
System.out.println();
}
}
}


