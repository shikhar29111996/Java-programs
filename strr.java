import java.io.*;
public class strr
{
public static void sort()throws IOException
{
InputStreamReader is=new InputStreamReader (System.in);
	BufferedReader br=new BufferedReader(is);
	String s,st=" ",t;char ch=' ',co,chh;
	int i, c=0,l,p=0,k=0,j,f=0;
do
	{
	System.out.println("entr sntnce");
	s=br.readLine();
	l=s.length();
	for(i=0;i<l-1;i++)
	{
	co=s.charAt(i);
	if(s.charAt(i)==' '&&s.charAt(i+1)==' ')
	f=1;
	if(((int)co<65||(int)co>90)&&(int)co!=32)
	f=1;
	ch=s.charAt(l-1);
	if(ch!='.'&&ch!='?'&&ch!='!')
	f=1;
	}
	if(f==1)
	{
	f=0;
	continue;
	}
	else
	break;
	}while(true);
	for(i=0;i<s.length()-1;i++)
	{
	chh=s.charAt(i);
	if(chh==' ')
	c++;
	}
	c=c+1;
	System.out.println("length "+c);
	String a[]=new String [c];
	for(i=0;i<l;i++)
	{	
	chh=s.charAt(i);
	if(chh==' '||chh=='.')
	{
	st=s.substring(p,i);
	p=i;
    a[k]=st;
	k++;
	}
	}
	for(i=0;i<a.length;i++)
System.out.print(a[i]);

	for(i=0;i<a.length;i++)
	{
	for(j=0;j<a.length-1-i;j++)
	{
	if(a[j].compareTo(a[j+1])>0)
	{
	t=a[j];
	a[j]=a[j+1];
	a[j+1]=t;
	}
	}
	}
	for(i=0;i<k;i++)
	{
	System.out.print(a[i]+" ");
	}
	}
	}
	
	