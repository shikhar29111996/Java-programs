import java.io.*;
public class testo extends dll
{

public static void main(String ags[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
testo ob=new testo();
int n=0,c=0,val=0,i,f=0,mukul;
do
{
System.out.println();
System.out.println("1:-Insert");
System.out.println("2:-delete");
System.out.println("3:-traverse");
System.out.println("4:-exit");

System.out.println("Enter ur choose - ");
n=Integer.parseInt(br.readLine());

switch(n)
{
case 1:
System.out.println("How many times ..huh?");
c=Integer.parseInt(br.readLine());
for(i=1;i<=c;i++)
{
System.out.println("Enetr value to be entered ");
val=Integer.parseInt(br.readLine());
ob.insert(val);
}
break;
case 2:
System.out.println("Enetr which node u want to cut the crap off -");
c=Integer.parseInt(br.readLine());
ob.delete(c);
break;
case 3:
ob.traverse();
break;
case 4:
f=1;
break;
}
}while(f!=1);

}
}



















