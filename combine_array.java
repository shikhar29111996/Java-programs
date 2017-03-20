class combine_array
    {
    public void main()
    {
    int a[]={1,-3,-6,8,12};
    int b[]={0,30,18,21,17};
    int c[]=new int[10];
    int i,j,k;
    i=j=k=0;
    for(i=0;i<8;i+=2)
    {
    c[i]=a[j];
    j++;
    }
    for(i=1;i<8;i+=2)
    {
    c[i]=b[k];
    k++;
    }
    c[8]=a[4];
    c[9]=a[3];
    for(i=0;i<10;i++)
    {
    System.out.println(c[i]+",");
    }
    }
    }