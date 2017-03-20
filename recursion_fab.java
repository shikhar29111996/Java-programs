import java.io.*;
class recursion_fab
{
    int s=1;
    
    public void fab(int a)
    {
        if(a>=1)
        {
            s=s*a;
            fab(--a);
        }
        
        else
        System.out.println("factorial is-"+s);
    }
    
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the number");
        int n=Integer.parseInt(dr.readLine());
        
        recursion_fab f=new recursion_fab();
        f.fab(n);
    }
}
            