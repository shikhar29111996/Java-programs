import java.io.*;

public class recursion_array_add
{
int c=0;

    public void main()throws IOException
    {
        int n,i;
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the limit");
        n=Integer.parseInt(dr.readLine());
        
        int a[]=new int[n];
        
        for(i=0;i<n;i++)
        {
            System.out.println("enter the number");
            a[i]=Integer.parseInt(dr.readLine());
        }
        
        add(n,a);
    }
    
    public void add(int n,int a[])
    {       
        if(n>0)
        {
            c=c+a[n-1];;
            add(--n,a);
        }
        else
        System.out.println(c);
    }
}