 import java.io.*;
 class possible_sum
{
     public static void main(String args[])throws IOException
    {
	     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   	     int i,j,k,s,c,count;
   	     
	     System.out.print("enter the no.");
	     int n=Integer.parseInt(br.readLine());
	     
         for(i=1;i<n;i++)
         {
             s=0;c=0;count=0;
             for(j=i;j<=n;j++)
             {
                 s=s+i;
                 count++;
                 if(s==n)
                 {
                     c=1;
                     break;
                 }
             }
             if(c==1)
             {
                 for(j=1;j<=count;j++)
                 {
                     if(j<count)
                     System.out.print(i+"+");
                     else
                     System.out.println(i+"="+s);
                 }
               }
         }
         
         int t=n+1,a=2;
         
         for(i=1;i<=n;i++)
         {
              t--;
              for(j=1;j<t;j++)
              {
                  if(j<t-1)
                  System.out.print(1+"+");
                  else
                  System.out.println((a++)+"="+n);
              }
         }
 
         
        for(i=1;i<=n;i++)
        {
            c=0;s=0;
           for(j=i;j<=n;j++)
           {
                s=s+j;
                if(s==n)
                {
                     c=1;
                     break;
                }
           }
           if(c==1)
            { 
                for(k=i;k<=j;k++)
                {
                      if(k<j)
                      System.out.print(k+"+");
                      else
                      System.out.println(k+"="+s);
                }
            }

        }
    }
 }