class array4
    {
    public static void main(int a[])
    {
    int i,j,t,len=a.length,m=0;
    boolean flag;
    for(i=0;i<len-1;i++)
    {
    flag=true;
    for(j=0;j<len-1-i;j++)
    {
    if(a[j]>a[j+1])
    {
    flag=false;
    t=a[j];
    a[j]=a[j+1];
    a[j+1]=t;
    }
    }
    if(flag)
    break;
    }
    m=0;
    for(i=0;i<len;i++)
    {
    System.out.println(a[i]);
    }
    
    }
    }