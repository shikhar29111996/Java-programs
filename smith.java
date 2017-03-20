import java.io.*;
class smith
{
    int no,n,j,sum=0,sumfactors=0,i;
    boolean bool;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void takeNumber() throws Exception
    {
        System.out.println("Enter the number:");
        n=Integer.parseInt(br.readLine());
        no=n;
        sum=sumOfDigits(n);
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                bool=prime(i);
                if(bool)
                {
                    j=i;
                    System.out.print(" "+j);
                    while(j >0)
                    {
                         sumfactors=sumfactors+j%10;
                         j=j/10;
                    }
                    n=n/i;
                    i--;
                }
            }
        }
            if(sum==sumfactors)
            System.out.println(no+ " is a smith number.");
            else
            System.out.println(no+ " is not a smith number.");
    }
    private int sumOfDigits(int n)
    {
        int s=0;
        while(n >0)
        {
            s=s+n%10;
            n=n/10;
        }
        return s;
    }

    private boolean prime(int n)
    {
        int i;
        for(i=2;i< n;i++)
        {
            if(n%i==0)
            break;
        }
        if(i==n)
        return true;
        else
        return false;
    }
    public static void main(String args[])throws Exception
    {
        smith obj=new smith();
        obj.takeNumber();
    }
}

