package Linked_List.Queue;


import java.io.*;
class Test extends Queue
{
    public static void main()throws IOException
    {
        Queue t=new Queue();
        
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
                
                t.insert(s);
            }
            
            else if(n==2)
            {
                t.delete();
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