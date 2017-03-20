package Linked_List.Linked_1;

import java.io.*;
class linklist extends Node
{
    Node start,first;
    
    public linklist()
    {
        start=null;
        first=null;
    }
    
    public boolean isempty()
    {
        return start==null;
    }
    
    public void insert1(int val)
    {
        boolean ins=false;
        Node nptr,ptr,save=null;
        
        nptr=new Node(val,null);
        
        if(start==null)
        {
            start=nptr;
        }
        
        else if(val<=start.getData())
        {
            nptr.setLink(start);
            
            start=nptr;
        }
        
        else
        {
            save=start;
            ptr=start.getLink();
            
            while(ptr!=null)
            {
                if(val>=save.getData()&&val<=ptr.getData())
                {
                    save.setLink(nptr);
                    nptr.setLink(ptr);
                    ins=true;
                    break;
                }
                
                else
                {
                    save=ptr;
                    ptr=ptr.getLink();
                }
            }
            if(ins==false)
            save.setLink(nptr);
        }
        
        
    }

    public void display()
    {
        Node temp=start;
        
        System.out.println();
        System.out.println("Elements are");
        System.out.println();
        
        while(temp!=null)
        {
            System.out.println(temp.getData());
            temp=temp.getLink();
        }
        
        temp=first;
        
        while(temp!=null)
        {
            System.out.println(temp.getData());
            temp=temp.getLink();
        }
    }
    
    public boolean delete(int val)
    {
        boolean ins=false;
        
        if(start.getData()==val)
        {
            start=start.getLink();
            ins=true;
        }
        
        else
        {
            Node ptr,save;
            save=start;
            ptr=start.getLink();
            
            while(ptr!=null)
            {
                if(ptr.getData()==val)
                {
                    Node next=ptr.getLink();
                    save.setLink(next);
                    
                    break;
                }
                else
                {
                    save=ptr;
                    ptr=ptr.getLink();
                }
            }
        }
        
        return ins;
    }

    public void delete_1(int v)
    {
        int i=1;
        
        Node temp=start,ptr=start.getLink();
        
        while(ptr!=null&&i<=v)
        {
            if(i==v)
            {
                Node next=ptr.getLink();
                temp.setLink(next);
                    
                break;
            }
            else
            {
                ptr=ptr.getLink();
                i++;
            }
        }
    }
    
    public void search(int v)
    {
        int i=1,p=1;
        
        Node ptr=start;
        
        while(ptr!=null)
        {
            if(ptr.getData()==v)
            {
                i=1;
                break;
            }
            
            else
            {
                ptr=ptr.getLink();
                p=p+1;
            }
        }
        
        if(i==1)
        {
            System.out.println("Element Found at position"+p);
        }
        
        else
        {
            System.out.println("Element Not Found");
        }
    }
    
    public void reverse()
    {
        Node n3=start;
 
        Node n2=null;
 
        Node n1=null;
 
        while(n3!= null)
        {
 
            n1=n2;
 
            n2=n3;
 
            n3=n2.getLink();
 
            n2.setLink(n1);
 
        }
 
        start=n2;
    }
    
    public void insert2(int val)
    {
        boolean ins=false;
        Node nptr,ptr,save=null;
        
        nptr=new Node(val,null);
        
        if(first==null)
        {
            first=nptr;
        }
        
        else if(val<=first.getData())
        {
            nptr.setLink(first);
            
            first=nptr;
        }
        
        else
        {
            save=first;
            ptr=first.getLink();
            
            while(ptr!=null)
            {
                if(val>=save.getData()&&val<=ptr.getData())
                {
                    save.setLink(nptr);
                    nptr.setLink(ptr);
                    ins=true;
                    break;
                }
                
                else
                {
                    save=ptr;
                    ptr=ptr.getLink();
                }
            }
            if(ins==false)
            save.setLink(nptr);
        }   
    }
    
    public void merge()
    {
        Node x=start,y=first;
        int c=0,i;
        
        while(x!=null)
        {
            c++;
            x=x.getLink();
        }
        
        x=start;
        y=first;
        
        for(i=1;i<=c+10;i++)
        {
            if(x==null||i==c)
            {
                x.setLink(y);
                break;
            }
            
            else
            {
                x=x.getLink();
            }
        }
    }
}