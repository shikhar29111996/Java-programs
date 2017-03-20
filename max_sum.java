import java.io.*;
class max_sum
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        int i,j,c=0,l,z=-1000,r=0,x=0,s=0;
        
        System.out.println("Enter the limit");
        l=Integer.parseInt(dr.readLine());
        
        int a[]=new int[l];
        
        for(i=0;i<l;i++)
        {
            System.out.println("Enter the number");
            a[i]=Integer.parseInt(dr.readLine());
        }
        
        for(i=0;i<l;i++)
        {
            c=i+1;
            
            while(c!=l)
            {
                for(j=i;j<=c;j++)
                {
                    s=s+a[j];
                }
                
                if(s>z)
                {
                    z=s;
                    r=i;
                    x=j-1;
                }
                
                s=0;
                c=c+1;
            }
            
            s=0;
            c=0;
        }
        
        System.out.println("Max sum="+z);
        System.out.println("Starting position="+r);
        System.out.println("Ending position="+x);
    }
}