import java.io.*;
class recursion_reverse
{
String s;
String a="";
    char ch;

    public void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the String");
        s=dr.readLine();
        int l=s.length();
        
        reverse(l-1);
    }
    
    public void reverse(int n)
    {
        if(n>=0)
        {
            ch=s.charAt(n);
            System.out.print(ch);
            reverse(--n);
            }
            }
            }