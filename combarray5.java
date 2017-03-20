import java.io.*;
class combarray5
    {
        public static void main()throws IOException
        {
            int a,b,i,j=0,k=0,m=0,n=0,t=0;
            BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the no.of elements in array 1");
            a=Integer.parseInt(dr.readLine());
            int x[]=new int[a];
            for(i=0;i<a;i++)
            {
                System.out.println("enter the elment in array 1 in place "+i);
                x[i]=Integer.parseInt(dr.readLine());
            }
            System.out.println("enter the no.of elements in array 2");
            b=Integer.parseInt(dr.readLine());
            int y[]=new int[b];
            for(i=0;i<b;i++)
            {
                System.out.println("enter the elment in array 1 in place "+i);
                y[i]=Integer.parseInt(dr.readLine());
            }
            int z[]=new int[a+b+2];
            for(i=0;i<(a+b);i++)
            {
                if(i<a)
                {
                z[i]=x[i];
                
                }
                else
                {
                 z[i]=y[i-a];
                }
            }
            System.out.println("Combined Array");
            for(i=0;i<(a+b);i++)
            {
                System.out.println(z[i]);
            }
        }
    }