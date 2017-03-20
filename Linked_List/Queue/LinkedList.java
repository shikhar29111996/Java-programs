package Linked_List.Queue;


class LinkedList
{
    private Node start;
    private Node end;
    public LinkedList()
    {
        start = null;
        end = null;
    }
    public boolean isEmpty()
    { 
        return start==null; 
    }
    public void insertEnd(int val)
    {//Insert node at the end of list
        Node newNode = new Node(val);
        if( isEmpty() )
            start = newNode;
        else
            end.next = newNode;
        end = newNode;
    }
    public int deleteStart()
    {//delete the node from the beginning of the list
        int temp = start.item;
        if(start.next == null)
            end = null;
        start = start.next;
        return temp;
    }
    public void displayList()
    {
        Node current = start;
        System.out.println("Elements are");
        
        while(current != null)
        {
            current.displayNode();
            current = current.next;
        }
        System.out.println("");
    }
}