class twinseries
{
public static void main()
{
int i,j,k,c=0,d=0,z;
for(i=1;i<=100;i++)
{
z=i;
c=0;
d=0;
for(j=1;j<=i;j++)
{
if((z%j)==0)
c++;
}
if(c==2)
{
for(k=1;k<z+2;k++)
{
if((z+2)%k==0)
d++;
if(d==2)
System.out.println(z+","+(z+2));
}
}
}
}
}