import java.io.*;
class recursive
{
int s=1;
 int power(int a,int b)
 {
     if(b>=1)
     {
         s=s*a;
         return power(a,--b);
      }
        else
        return s;
  }
public static void main()throws IOException
{
    BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
recursive obj=new recursive();
System.out.println("enter the numbers");
  int a=Integer.parseInt(dr.readLine());
  int b=Integer.parseInt(dr.readLine());
int z=  obj.power(a,b);
System.out.println(z);
}
}