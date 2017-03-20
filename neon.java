class neon
{
void get(int n)
{
int s,a,sum;
s=n*n;
sum=0;
while(s!=0)
{
a=s%10;
sum=sum+a;
s=s/10;
}
if(sum==n)
System.out.println("neon");
else
System.out.println("not");
}
}
