import java.io.*;
public class gender2
{
public void func()throws IOException
{
int n,c,i,pos,d,z=0,y=0,k=0,o=0,j;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String a[]=new String[5];
char b[]=new char[5];
String ab[]=new String[5];
for(i=0;i<5;i++)
{
System.out.println("Enter the name");
a[i]=br.readLine();
System.out.println("Enter the gender");
ab[i]=br.readLine();
b[i]=ab[i].charAt(0);
}
for(i=0;i<5;i++)
{
if(b[i]=='m')
z=z+1;
else
y=y+1;
}
String m[]=new String[z];
String f[]=new String[y];
for(i=0;i<5;i++)
{
if(b[i]=='m')
{
m[k]=a[i];
k++;
}
else
{
f[o]=a[i];
o++;
}
}
int max=o;
if(o<k)
max=k;
System.out.println("boy       girl");

for(i=0;i<max;i++)
{
if(i<(k))
System.out.print(m[i]+"         ");
if(i<o)
System.out.print(f[i]);
System.out.println();
}
}
}




