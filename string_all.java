import java.io.*;
class string_all
{
    public static void main()throws IOException
    {
        BufferedReader dr =new BufferedReader(new InputStreamReader(System.in));
        
        int i,ch=0;
        
        System.out.println("Enter the limit of arra");
        int l=Integer.parseInt(dr.readLine());
        String s[]=new String[l];
        
        for(i=0;i<l;i++)
        {
            System.out.println("enter the string in index "+i);
            s[i]=dr.readLine();
        }
        
        do
        {
            System.out.println("1-reverse String (Each character)");
            System.out.println("2-Frequency Of each character in string");
            System.out.println("3-Arranging in order of length");
            System.out.println("4-Arranging in order of frequency");
            System.out.println("5-Exit");
            System.out.println("enter the choice");
            ch=Integer.parseInt(dr.readLine());
        
            string_all don=new string_all();
        
            for(i=0;i<l;i++)
            {
                if(ch==1)
                {
                    don.reverse(s[i]);
                }
                
                if(ch==2)
                {
                    don.frequency(s[i]);
                }
            
                if(ch==3)
                {
                    don.arrangement1(s[i]);
                }
                if(ch==4)
                {
                    don.arrangement2(s[i]);
                }
            }
        }while(ch!=5);
    }
    
    public void reverse(String a)
    {
        int x,y,z;
        String m="",p="";
        char b;
        a=a+" ";
        x=a.length();
        for(y=0;y<x;y++)
        {
            b=(a.charAt(y));
            if(b==' ')
            {
                p=p+" "+m;
                m="";
            }
            else
            m=b+m;
        }
       
        System.out.println(p);
    }
    
    public void frequency(String str)
    {
       int len,c=0,m,i,s;
       char ch,che;
       str=str.toUpperCase();
       len=str.length();
       for(m=65;m<90;m++)
       {
          c=0;
          for(i=0;i<len;i++)
          {
             ch=str.charAt(i);
             s=(int)ch;
             if(s==m)
             {
                c=c+1;
             }
          }
          
          che=(char)m;
          if(c!=0)
          System.out.println("Frequency of "+che+" is "+c);
       }
    }
    
    public void arrangement1(String s)
    {
        int l,i,c=0,z=0,j;
        String m="",t;
        char ch;
        
        s=s+" ";
        l=s.length();
       
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            c++;
        }
        
        String a[]=new String[c];
        
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            
            if(ch==' ')
            {
                
                a[z]=m;
                m="";
                z++;
                
            }
            else
            {
                m=m+ch;
            }
        }
        
        for(i=0;i<c;i++)
        {
            for(j=0;j<c-1;j++)
            {
                if(a[j].length()>a[j+1].length())
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        
        for(i=0;i<c;i++)
        {
            System.out.println(a[i]);
        }
    }
    
    public void arrangement2(String s)
    {
        int l,i,z=0,c=0,j,count=0,x;
        String m="",t;
        char ch;
        
        s=s+" ";
        l=s.length();
        
        
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            c++;
        }
        
        String a[]=new String[c];
        
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            
            if(ch==' ')
            {
                
                a[z]=m;
                m="";
                z++;
                
            }
            else
            {
                m=m+ch;
            }
        }
        
        int co[]=new int[c];
        
        for(i=0;i<c;i++)
        {
            for(j=0;j<c;j++)
            {
                if(a[i].equals(a[j]))
                {
                    count++;
                }
            }
                co[i]=count;
                count=0;
        }
        
        for(i=0;i<c;i++)
        {
            for(j=0;j<c-1;j++)
            {
                if(co[j]>co[j+1])
                {
                    x=co[j];
                    co[j]=co[j+1];
                    co[j+1]=x;
                    
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        
        for(i=0;i<c;i++)
        {
            System.out.println(a[i]);
        }
    }
}