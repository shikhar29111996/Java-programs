class callbyreference
    {
    int x=10,y=20;
    public void yesh(int i,int j)
    {
    int t=i;
    i=j;
    j=t;
    System.out.println("swapped values are "+i+","+j);
    }
    
    public void shikhar(callbyreference object)
    {
    int m=object.x;
    object.x=object.y;
    object.y=m;
    System.out.println("callby reference swapped values are "+object.x+","+object.y);
    }
    void show()
    {
    callbyreference obj=new callbyreference();
    yesh(x,y);
    shikhar(obj);
    }}