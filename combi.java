import java.io.*;
class combi
{
    int z[];
    
    combi()
    {
        z=new int[10];
    }
    
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        combi a=new combi();
        combi b=new combi();
        combi c=new combi();
        combi d;
        
        a.fillarray();
        b.fillarray();
        d=c.common(a,b);
        d.display();
    }
    
    public void fillarray()throws IOException
    {
        int i;
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the numbers");
        
        for(i=0;i<10;i++)
        {
            z[i]=Integer.parseInt(dr.readLine());
        }
    }
    
    public combi common(combi a,combi b)throws IOException
    {
        int i,j;
        combi c=new combi();
        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if(a.z[i]==b.z[j])
                {
                    c.z[i]=a.z[i];
                }
            }
        }
        return c;
    }
    
    public void display()throws IOException
    {
        int i;
        
        for(i=0;i<z.length;i++)
        {
            System.out.println(z[i]);
        }
    }
}