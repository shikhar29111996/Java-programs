import java.io.*;
class recursion_vowel
{
    String s;
    char ch;
    int c=0;

    public void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the String");
        s=dr.readLine();
        int l=s.length();
        
        vowel(l-1);
    }
    
    public void vowel(int n)
    {
        if(n>=0)
        {
            ch=s.charAt(n);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                c++;
                System.out.println(ch);
            }
            
         }
         vowel(--n);
    }
}