package Inheritence.points;


import java.io.*;

class best4 extends iscscores
{
    public void subjects()throws IOException
    {
        int i,j,t=0,z=0;
        
        
        z=super.point();
        System.out.println(z);
        for(i=0;i<6;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("/n /n /n");
        int x[]=new int[6];
        int y[]=new int[6];
        
        for(i=0;i<6;i++)
        {
            x[i]=n[i][0];

        }
        
        for(i=0;i<6;i++)
        {
            for(j=0;j<5;j++)
            {
                if(x[j]<x[j+1])
                {
                    t=x[j];
                    x[j]=x[j+1];
                    x[j+1]=t;
                    
                    
                }
            }
        }
        
        for(i=0;i<4;i++)
        {
            System.out.println(x[i]+" ");
        }
            
        
    }
}