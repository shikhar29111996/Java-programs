package Inheritence.data_process;

import java.io.*;
class data
{
    protected String str;
    
    data()
    {
        str="";
    }
    
    void input()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the sentence");
        str=dr.readLine();
    }
    
    void print()
    {
        System.out.println("\n\n\n"+str);
    }
}