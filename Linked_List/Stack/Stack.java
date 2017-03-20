package Linked_List.Stack;

import java.io.*;
class Stack extends Node
{
    int n;
    Node top;
    
    Stack()
    {
        n=0;
        top=null;
    }
    
    public void push(int s)
    {
        top=new Node(s,top);
        n++;
    }
    
    public boolean isempty()
    {
        boolean r=false;
        if(n==0)
        r=true;
        
        else
        r=false;
        
        return r;
    }
    
    public int pop()
    {
        int m=0;
        
        if(isempty()==true)
        System.out.println("No Node");
        
        else
        {
            m=top.getData();
            top=top.getLink();
        }
        
        return m;
    }
    
    public void display()
    {
        Node ptr;
        
        if(isempty()==true)
        System.out.println("No Node");
        
        else
        {
            ptr=top;
            
            while(ptr!=null)
            {
                System.out.println(ptr.getData());
                ptr=ptr.getLink();
            }
        }
    }
}