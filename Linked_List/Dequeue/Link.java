package Linked_List.Dequeue;

class Link
{
    int rlno;
    String name;
    Link next;
    Link previous;
    
    Link(int r,String y)
    {
        rlno=r;
        name=y;
    }
    
    void dis()
    {
        System.out.println(rlno+" "+name);
    }
}