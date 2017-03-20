package Linked_List.Queue;


class Queue
{
    private LinkedList listObj;
    public Queue()
    {
        listObj = new LinkedList(); 
    }
    public boolean isEmpty()
    { 
        return listObj.isEmpty(); 
    }
    public void insert(int k)
    { 
        listObj.insertEnd(k); 
    }
    public int delete()
    { 
        return listObj.deleteStart(); 
    }
    public void display()
    {
        System.out.print("Queue [start to end]: ");
        listObj.displayList();
    }
}