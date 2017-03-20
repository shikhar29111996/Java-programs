import java.io.*;
class circular_name
{
    public static void main(String args[])throws IOException
    {
        BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
        String name;
        System.out.println("enter the name");
        name=d.readLine();
        int len,n,r=0,c=-1,i=0,j,z;
        char t;
        len=name.length();
        n=(len*2)-1;
        char a[][]=new char [n][n];
        z=n;
        
        while(n>0)
        {
            t=name.charAt(i);
            
            for(j=1;j<=n;j++)
            a[r][++c]=t;
            
            for(j=1;j<n;j++)
            a[++r][c]=t;
            
            for(j=1;j<n;j++)
            a[r][--c]=t;
            
            for(j=1;j<n-1;j++)
            a[--r][c]=t;
            
            n=n-2;
            i=i+1;
        }
        
        n=z;
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}