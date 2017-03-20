package Linked_List.Queue;

import java.io.*;
class Node
{
    public int item;
    public Node next;
    public Node(int val)
    { 
        item = val; 
    }
    public void displayNode()
    { 
        System.out.println(item); 
    }
}