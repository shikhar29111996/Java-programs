import java.io.*;
class password
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the password");
        String n=dr.readLine();
        
        int l,i,j;
        boolean a=false,b=false,c=false;
        
        for(i=0;i<n.length();i++)
        {
            char ch=n.charAt(i);
            int z=ch;
            
            for(j=65;j<=90;j++)
            {
                if(z==j)
                a=true;
            }
            
            for(j=96;j<=121;j++)
            {
                if(z==j)
                b=true;
            }
            
                
            if(Character.isDigit(ch)==true)
            {
                c=true;
            }
        }
        
        if(a==true||b==true||c==true)
        {
        System.out.println("weak");
        }
        if((a==true&&b==true)||(b==true&&c==true)||(a==true&&c==true))
        {
        System.out.println("aceptable");
        }
        if(a==true&&b==true&&c==true)
        {
        System.out.println("gud");
        }
        }
        }