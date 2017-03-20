package Linked_List.Stack;

import java.io.*;
class Test extends Stack
{
    public static void main()throws IOException
    {
        Test t=new Test();
        
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in)); 
        int n;
        
        do
        {
            System.out.println("1-enter the element");
            System.out.println("2-delete the element");
            System.out.println("3-display");
            System.out.println("4-exit");
            n=Integer.parseInt(dr.readLine());
        
            if(n==1)
            {
                System.out.println("Enter the element");
                int s=Integer.parseInt(dr.readLine());
                
                t.push(s);
            }
            
            else if(n==2)
            {
                t.pop();
            }
            
            else if(n==3)
            {
                t.display();
            }
            
            else
            {
                System.out.println("Thank you");
            }
        }while(n!=4);
    }
}