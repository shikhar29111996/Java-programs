import java.io.*;
import java.util.*;
class swap
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        int x,i,z,j,l;
        String a,y,m="";
        char c,d;
        
        System.out.println("enter the string");
        a=dr.readLine();
        
        StringTokenizer s= new StringTokenizer(a);
        
        x=s.countTokens();
        
        for(i=0;i<x;i++)
        {
            y=s.nextToken();
            
            l=y.length();
            
            if(l%2==0)
            {
                for(j=0;j<l;j=j+2)
                {
                    z=j+1;
                
                    c=y.charAt(j);
                    d=y.charAt(z);
                
                    m=m+d+c;
                }
                m=m+" ";
            }
            
            else
            {
                for(j=0;j<l-2;j=j+2)
                {
                    z=j+1;
                
                    c=y.charAt(j);
                    d=y.charAt(z);
                
                    m=m+d+c;
                }
                c=y.charAt(l-1);
                m=m+c+" ";
            }
        }
        
        System.out.println(m);
    }
}