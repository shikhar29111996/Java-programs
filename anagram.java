class anagram
{
public static void mk(String s)
{
int ln=0,f=1,i,j,ind=1,c=0,count=0,k=0;
char ch,t;
String sub="";
ln=s.length();
for(i=ln;i>=1;i--)
f=f*i;

String ar1[]=new String[f];
char ar2[]=new char[ln];
for(i=0;i<ln;i++)
{
ch=s.charAt(i);
ar2[i]=ch;
}

while(true)
{

//forward circular printing............
for(i=0;i<ln;i++)
{
for(j=i;j<ln;j++)
{
sub=sub+ar2[j];
c++;
if(c!=ln&&j==ln-1)
j=-1;
if(c==ln)
break;
}
c=0;
ar1[k++]=sub;
count++;
sub="";
}

//backward circular printing###########
for(i=ln-1;i>=0;i--)
{
for(j=i;j>=0;j--)
{
sub=sub+ar2[j];
c++;
if(c!=ln&&j==0)
j=ln;
if(c==ln)
break;
}
c=0;
ar1[k++]=sub;
count++;
sub="";
}
if(count==f)
break;
t=ar2[0];
ar2[0]=ar2[ind];
ar2[ind++]=t;
}

}
}



