import java.io.*;
class student_record
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        FileWriter fout=new FileWriter("students.txt");
        BufferedWriter bout=new BufferedWriter(fout);
        PrintWriter pout=new PrintWriter(bout);
        
        System.out.println("Enter the number of students");
        int n=Integer.parseInt(dr.readLine());
        
        int i,l,z=0,a=0,b=0,c=0,sum=0;
        
        String s;
        
        char ch1,ch2,ch3;
        
        for(i=1;i<=n;i++)
        {
            System.out.println("Name  English  Hindi  Computer");
            s=dr.readLine();
            pout.println(s);
        }
        pout.close();
        
        FileReader fout2=new FileReader("students.txt");
        BufferedReader bout2=new BufferedReader(fout2);
        
        while((s=bout2.readLine())!=null)
        {
            l=s.length();
            
            for(i=l-1;i>=0;i=i-1)
            {
                ch1=s.charAt(i);
                a=ch1;
                
                if(Character.isDigit(ch1)==true)
                {
                    ch2=s.charAt(i-1);
                    z=1;
                    b=ch2;
                    System.out.println(ch2);
                    
                    if(Character.isDigit(ch2)==true)
                    {
                        ch3=s.charAt(i-1);
                        z=2;
                        c=ch3;
                        System.out.println(ch3);
                    }
                }
                if(z==1||z==2)
                sum=(a*100)+(b*10)+c;
                
                if(z==1)
                i=i-2;
                
                if(z==2)
                i=i-3;
            }
        }
        bout2.close();
    }
}