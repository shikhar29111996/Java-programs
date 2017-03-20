import java.io.*;
class recursion_prime
{
    int limit,arr[],c=0;
    
    recursion_prime()
    {
        limit=0;
        arr=new int[limit];
    }
    
    void readlist()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        int i,a=0;
        
        System.out.println("enter the limit");
        limit=Integer.parseInt(dr.readLine());
        
        arr=new int[limit];
        
        for(i=0;i<limit;i++)
        {
            arr[i]=Integer.parseInt(dr.readLine());
        }
        
    }
    
    void isprime(int a,int b)
    {
        int i;
        
        for(i=1;i<=limit;i++)
        {
            if(b%i==0)
            {
                a++;
            }
        }
        
        if(a!=2)
        {
            System.out.println("yes");
        }
        
        else
        {
            System.out.println("no");
        }
    }
    
    void printprime()
    {
        int i,a=0;
        
        recursion_prime ss=new recursion_prime();

        for(i=0;i<limit;i++)
        {
            isprime(a,arr[i]);
        }
    }
    
    public void main()throws IOException
    {
        readlist();
        printprime();
    }
}