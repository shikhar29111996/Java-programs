package Linked_List.Linked_1;

import java.io.*;
public class Node
{
    int data;
    Node link;
    
    Node()
    {
        data=0;
        link=null;
    }
    
    Node(int d,Node n)
    {
        data=d;
        link=n;
    }
    
    public void setLink(Node n)
    {
        link=n;
    }
    
    public void setData(int d)
    {
        data=d;
    }
    
    public Node getLink()
    {
        return link;
    }
    
    public int getData()
    {
        return data;
    }
}
