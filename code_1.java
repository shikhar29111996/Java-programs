import java.io.*;
class code_1
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        code_1 yo=new code_1();
        
        String s,a="",b="";
        int l,i,j,z,x,m;
        char ch,ch1,ch2,ch3,c;
        
        System.out.println("enter the string");
        s=dr.readLine();
        
        l=s.length();
        
        for(i=l-1;i>=0;i--)
        {
            ch=s.charAt(i);
            a=a+ch;
        }
        
        for(i=0;i<a.length();)
        {
            z=i+1;
            x=i+2;
            
            ch1=a.charAt(i);
            b=b+ch1;
            
            ch2=a.charAt(z);
            b=b+ch2;
            
            m=Integer.parseInt(b);
            
            if(m>=65&&m<=90)
            {
                i=i+2;
                c=(char)m;
               
        
                System.out.println(c);
            }
            
            else if(m>=97&&m<99)
            {
                i=i+2;
                
                c=(char)m;
        
                System.out.println(c);
            }
            
            else if(m<65&&m!=32)
            {
                ch3=a.charAt(x);
                b=b+ch3;
                m=Integer.parseInt(b);
                
                i=i+3;
                
                c=(char)m;
        
                System.out.println(c);
            }
            
            else if(m==32)
            {
                System.out.println(" ");
                i=i+2;
            }
            b="";
        }
    }
    
}