import java.io.*;
class array
{
    int a[][];
    int n;
    
    public void limit()throws IOException
    {        
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter number of rows and coulums");
        n=Integer.parseInt(dr.readLine());
        
        check(n);
    }
    
    public void check(int n)throws IOException
    {
        if(n>=2&&n<=5)
        
        enter();
        
        else
        limit();
    }
    
    public void enter()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        a=new int [n][n];
        
        int i,j;
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("enter the element");
                a[i][j]=Integer.parseInt(dr.readLine());
            }
        }
    }
    
    public void transpose()
    {
        int b[][]=new int[n][n];
        
        int i,j,t;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=a[i][j];
            }
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                t=b[i][j];
                b[i][j]=b[j][i];
                b[j][i]=t;
            }
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
    
    public void mirror()
    {
        int i,j,x=0,y=n-1,t;
        
        for(i=0;i<n;i++)
        {
            while(x<y)
            {
                t=a[i][x];
                a[i][x]=a[i][y];
                a[i][y]=t;
                x=x+1;
                y=y-1;
            
            }
            x=0;
            y=n-1;
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
    
    public void main()throws IOException
    {
        limit();
        transpose();
        mirror();
    }
}
        
            
            