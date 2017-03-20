class ascendingarray
    {
    public static void main(int a[])
    {
    int i,j,s,p,l,t;
    l=a.length;
    for(i=0;i<l;i++)
    {
    s=a[i];
    p=i;
    for(j=i+1;j<l;j++)
    {
    if(a[j]<s)
    {
    s=a[j];
    p=j;
    }
    }
    t=a[i];
    a[i]=a[p];
    a[p]=t;
    }
    for(i=0;i<l;i++)
    {
    System.out.println(a[i]);
    }
    }
    }