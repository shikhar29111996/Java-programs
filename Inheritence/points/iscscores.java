package Inheritence.points;


import java.io.*;
class iscscores
{
    int n[][]=new int[6][2];
    
    
    
    public int point()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        int i,j,s=0,x=0,p=0;
        
        for(i=0;i<6;i++)
        {
            System.out.println("/n NEW ENTRY /n");
            System.out.println("Enter the number and code of subject "+i);
            for(j=0;j<2;j++)
            {
                n[i][j]=Integer.parseInt(dr.readLine());
            }
        }
        
        for(i=0;i<6;i++)
        {
            x=n[i][0];
            
            if(x>=90)
            p=1;
            
            else if(x<=89&&x>=80)
            p=2;
            
            else if(x<=79&&x>=70)
            p=3;
            
            else if(x<=69&&x>=60)
            p=4;
            
            else if(x<=59&&x>=50)
            p=5;
            
            else if(x<=49&&x>=40)
            p=6;
            
            else if(x<=39&&x>=30)
            p=7;
            
            else if(x<=29&&x>=20)
            p=8;
            
            else if(x<=19&&x>=10)
            p=9;
            
            else if(x<=9&&x>=0)
            p=10;
            
            s=s+p;
        }
        
        System.out.println(s);
        
        return s;
    }
}