class pseua_arithmatic
    {
    public static void main()
    {
    int a[]={2,5,6,8,9,12};
    int n=6,i,flag=0;
    int r=a[0]+a[n-1];
    for(i=0;i<n/2;i++)
    {
    if((a[i]+a[n-i-1])==r)
    continue;
    else
    {
    flag=1;break;
    }
    }
    if(flag==1)
    System.out.println("NO");
    else
    {
    int t=a[0]+a[n-1];
    int sum;
    if(n%2==0)
    sum=(n/2)*t;
    else
    sum=(n+1)/2*t;
    System.out.println("yes \n sum="+sum);
    }
    }
    }