import java.io.*;
class vowel_highest
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        String s;
        
        System.out.println("enter the Sentence");
        s=dr.readLine();
        
        vowel_highest v=new vowel_highest();
        
        v.vowel(s);
    }
    
    public void vowel(String s)
    {
        int a=0,i=0,e=0,o=0,u=0,j,m,k;
        char ch;
        
        for(j=0;j<s.length();j++)
        {
            ch=s.charAt(j);
            if(ch=='a')
            {
                System.out.println(ch);
                a++;
            }
            
            if(ch=='e')
            {
                System.out.println(ch);
                e++;
            }
            
            if(ch=='i')
            {
                System.out.println(ch);
                i++;
            }
            
            if(ch=='o')
            {
                System.out.println(ch);
                o++;
            }
            
            if(ch=='u')
            {
                System.out.println(ch);
                u++;
            }
        }
        
        char y[]={'a','e','i','o','u'};
        int z[]=new int[5];
        
        j=0;
        
        z[j]=a;
        j++;
        z[j]=e;
        j++;
        z[j]=i;
        j++;
        z[j]=o;
        j++;
        z[j]=u;
        
        for(j=0;j<5;j++)
        {
            for(k=0;k<j-k+1;k++)
            {
                if(z[k]>z[k+1])
                {
                    m=z[k];
                    z[k]=z[k+1];
                    z[k+1]=m;
                    
                    ch=y[k];
                    y[k]=y[k+1];
                    y[k+1]=ch;
                }
            }
        }
        
        for(j=0;j<6;j++)
        {
            System.out.println(y[i]+"  "+z[i]);
            if(z[i]==z[i+1])
            break;
        }
    }
}