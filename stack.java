class stack extends node
{
node top;
int no,m;
public stack()
{
top=new node(0,null);
no=0;
}
public void push(int val)
{
top=new node(val,top);
no++;
}
public boolean isempty()
{
boolean f=false;
if(no==0)
f=true;
else
f=false;
return f;
}
public int pop()
{
if(isempty()==true)
System.out.println("no node presnt");
else
{
m=top.getdata();
top=top.getlink();
no--;
}
return m;
}
public void display()
{
node ptr;
ptr=top;
while(ptr.getlink()!=null)
{
System.out.println(ptr.getdata());
ptr=ptr.getlink();
}
}
}

