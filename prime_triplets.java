import java.io.*;
class prime_triplets
{
    public static void main()throws IOException
    {
        int s,l,d=0,c=0,b=0,i,j,a=0;
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the Starting limit");
        s=Integer.parseInt(dr.readLine());
        System.out.println("enter the Ending limit");
        l=Integer.parseInt(dr.readLine());
 
        
        for(i=s;i<=l;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                a++;
            }
            if(a==2)
            {
                for(j=1;j<=i+2;j++)
                {
                    if((i+2)%j==0)
                    b++;
                }
                for(j=1;j<=i+4;j++)
                {
                    if((i+4)%j==0)
                    c++;
                }
                for(j=1;j<=i+6;j++)
                {
                    if((i+6)%j==0)
                    d++;
                }
            }
            if(a==2&&b==2&&d==2&&(i+2)<=l&&(i+6)<=l)
            System.out.println(i+","+(i+2)+","+(i+6));
            else if(a==2&&c==2&&d==2&&(i+4)<=l&&(i+6)<=l)
            System.out.println(i+","+(i+4)+","+(i+6));
            
            a=0;
            b=0;
            c=0;
            d=0;
        }
        
        
    }
}