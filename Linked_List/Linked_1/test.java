package Linked_List.Linked_1;

import java.io.*;
class test extends linklist
{
    public static void main()throws IOException
    {
        test t=new test();
        
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the first node of first link list");
        int s=Integer.parseInt(dr.readLine());
        
        t.insert1(s);
        
        System.out.println("enter the first node of second link list");
        s=Integer.parseInt(dr.readLine());
        
        t.insert2(s);
        
        int ch;
        
        do
        {
            System.out.println("1-insert 1");
            System.out.println("2-Display");
            System.out.println("3-Delete");
            System.out.println("4-Delete_1");
            System.out.println("5-Search");
            System.out.println("6-Reverse");
            System.out.println("7-Insert 2");
            System.out.println("8-Merge");
            System.out.println("9-Exit");
            ch=Integer.parseInt(dr.readLine());
            
            if(ch==1)
            {
                System.out.println("enter the node");
                s=Integer.parseInt(dr.readLine());
                
                t.isempty();
                t.insert1(s);
            }
            
            else if(ch==2)
            {
                t.display();
            }
            
            else if(ch==3)
            {
                System.out.println("enter the node");
                s=Integer.parseInt(dr.readLine());
                
                t.isempty();
                t.delete(s);
                t.display();
            }
            
            else if(ch==4)
            {
                System.out.println("enter the place");
                s=Integer.parseInt(dr.readLine());
                
                t.isempty();
                t.delete_1(s);
                
            }
            
            else if(ch==5)
            {
                System.out.println("enter the node");
                s=Integer.parseInt(dr.readLine());
                
                t.isempty();
                t.search(s);
                
            }
            
            else if(ch==6)
            {
                t.reverse();
            }
            
            else if(ch==7)
            {
                System.out.println("enter the node");
                s=Integer.parseInt(dr.readLine());
                
                t.isempty();
                t.insert2(s);
            }
            
            else if(ch==8)
            {
                System.out.println("Go");
                t.merge();
            }
            
            else
            {
                System.out.println("Thank you");
            }
        }
        while(ch!=9);
    }
}