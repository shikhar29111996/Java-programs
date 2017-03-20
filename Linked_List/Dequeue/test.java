package Linked_List.Dequeue;

import java.io.*;
import java.lang.*;
class test extends Dequeue
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        int ch,r;
        String s;
        
        do
        {
            test t=new test();
            
            System.out.println("1-Insert at front");
            System.out.println("2-Insert at last");
            System.out.println("3-Delete at front");
            System.out.println("4-Delete at front");
            System.out.println("5-Display");
            System.out.println("6-Exit");
            ch=Integer.parseInt(dr.readLine());
            
            if(ch==1)
            {
                System.out.println("enter the name");
                s=dr.readLine();
                System.out.println("enter the rol number");
                r=Integer.parseInt(dr.readLine());
                
                t.insert1(r,s);
            }
            
            else if(ch==2)
            {
                System.out.println("enter the name");
                s=dr.readLine();
                System.out.println("enter the rol number");
                r=Integer.parseInt(dr.readLine());
                
                t.insert2(r,s);
            }
            
            else if(ch==3)
            t.delete1();
            
            else if(ch==4)
            t.delete2();
            
            else if(ch==5)
            t.display();
        }while(ch!=6);
    }
}
        