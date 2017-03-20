import java.io.*;
class perfect_square
{
    public static void main()throws IOException
    {
        int i,j,n,b,d,c=0,m=0,k,l;
        double a;
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the last limit");
        n=Integer.parseInt(dr.readLine());
        for(i=1;i<=n;i++)
        {
            a=Math.sqrt(i);
            for(j=1;j<=i;j++)
            {
                if(a==j)
                {
                    b=i;
                    while(b!=0)
                    {
                        d=b%10;
                        c=c+1;
                        b=b/10;
                    }
                    b=i;
                    int z[]=new int[c];
                    for(k=0;k<c;k++)
                    {
                        m=0;
                        for(l=0;l<c;l++)
                        {
                            if(z[k]==z[l])
                            {
                                m=m+1;
                            }
                        }
                        if(m!=0)
                        {
                            System.out.println(i);
                        }
                    }
                }
            }
        }
    }
}