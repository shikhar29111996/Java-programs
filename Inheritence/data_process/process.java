package Inheritence.data_process;

import java.io.*;
class process extends data
{
    int l;
    
    void duplicate()throws IOException
    {
        super.input();
        super.print();
        
        String s=super.str,a="";
        int i,j=0;
        char c,d;
        l=(super.str).length();
        s=s+" ";
        
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            d=s.charAt(i+1);
            
            if(c==d)
            j++;
            
            else
            {
                a=a+c;
            }
        }
        
        System.out.println(a);
    }
    
    public static void main(String args[])throws IOException
    {
        process p=new process();
        
        
        p.duplicate();
    }
}