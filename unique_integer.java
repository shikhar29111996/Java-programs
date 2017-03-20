import java.io.*;
class unique_integer
{
  public static void main(String args[])throws IOException
  {
      int k,x,i,j,m,n,f=0,arr[],index=0;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     arr=new int[1000];
     while(true)
     {  
        System.out.println("Enter the Lower range:");
        m=Integer.parseInt(br.readLine());
        System.out.println("Enter the Upper range:");
        n=Integer.parseInt(br.readLine());
        if(m<n)
        break;
    }
        
     System.out.println("The unique digit integers are:");
     for(i=m;i<=n;i++)
     {
         index=0;
         for(j=i;j>0;j=j/10)
         {
             x=j%10;
             for(k=0;k<index;k++)
             {
                  if (arr[k]==x)
                  break;
             }
          if(k<index)
          break;
          else
          arr[index++]=x;
         }
         if(j==0)
         {
            f++;
            System.out.println(" "+i);
         }
     }

      System.out.println("\n \nFequency of unique digit integers is :"+ f);
  }
}
