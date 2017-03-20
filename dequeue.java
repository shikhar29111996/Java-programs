import java.io.*;
class dequeue
{
   
   
    public void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the limit");
        int x=Integer.parseInt(dr.readLine());
        int a[]=new int[x];
        int f=0;
        int l=x-1;
        int ch,r,i;
        int z=0;
        int y=x-1;
        
        do
        {
            dequeue t=new dequeue();
            
            System.out.println("1-Insert at front");
            System.out.println("2-Insert at last");
            System.out.println("3-Delete at front");
            System.out.println("4-Delete at front");
            System.out.println("5-Display");
            System.out.println("6-Exit");
            ch=Integer.parseInt(dr.readLine());
            
            if(ch==1)
            {
                System.out.println("enetr");
                r=Integer.parseInt(dr.readLine());
                a[f++]=r;
            }
            
            else if(ch==2)
            {
                System.out.println("enetr");
                r=Integer.parseInt(dr.readLine());
                a[l--]=r;
            }
            
            else if(ch==3)
             z=z+1;
            
            else if(ch==4)
            y=y-1;
            
            else if(ch==5)
            {
            for(i=z;i<=y;i++)
            {
                System.out.println(a[i]);
            }}
        }while(ch!=6);
    }
    
    
}