class vanders
{
    public static void main(int n)
    {
        int i,j,h,t;
        int a[][]=new int[n][n];
        
        int b[]={1,2,3,4,5};
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=b[j];
            }
            
            for(h=0;h<n-1;h++)
            {
                t=b[h];
                b[h]=b[h+1];
                b[h+1]=t;
            }
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}