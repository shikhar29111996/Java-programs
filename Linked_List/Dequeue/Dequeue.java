package Linked_List.Dequeue;

import java.io.*;
import java.lang.*;

class Dequeue
{
    Link first,last;
    int n;
    
    Dequeue()
    {
        first=null;
        n=0;
        last=null;
    }
    
    public boolean isempty()
    {
        return (first==null);
    }
    
    void insert1(int r,String na)
    {
        Link nl=new Link(r,na);
        
        if(isempty())
        last=null;
        
        else
        {
            first.previous=nl;
            nl.next=first;
        }
        first=nl;
        ++n;
    }
    
    void insert2(int r,String na)
    {
        Link nl=new Link(r,na);
        
        if(isempty())
        first=null;
        
        else
        {
            last.next=nl;
            nl.previous=last;
        }
        last=nl;
        ++n;
    }
    
    void display()
    {
        Link c=first;
        int a=n;
        
        System.out.println();
        
        while(a!=0)
        {
            c.dis();
            c=c.next;
            a=a-1;
            System.out.println(c);
        }
    }
    
    void delete1()
    {
        Link temp=first;
        
        if(first==null)
        System.out.println("queue is empty");
        
        else
        {
            if(first.next==null)
            last=null;
            
            else
            {
                first.next.previous=null;
                first=first.next;
            }
        }
        --n;
    }
    
    void delete2()
    {
        Link temp=last;
        
        if(last==null)
        System.out.println("queue is empty");
        
        else
        {
            last.previous.next=null;
            last=last.previous;
        }
        --n;
    }
}