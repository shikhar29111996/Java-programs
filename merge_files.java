import java.io.*;
class merge_files
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        String s1,s2,t;
        int i=0,b=0,j,l;
        char ch;
        
        //create a file text1
        
        FileWriter fout1=new FileWriter("text1.txt");
        BufferedWriter bout1=new BufferedWriter(fout1);
        PrintWriter pout1=new PrintWriter(bout1);
        
        System.out.println("enter 5 names");
        
        for(i=0;i<5;i++)
        {
            s2=dr.readLine();
             pout1.println(s2);
        }
        pout1.close();
        
        //create text 2
        
        FileWriter fout2=new FileWriter("text2.txt");
        BufferedWriter bout2=new BufferedWriter(fout2);
        PrintWriter pout2=new PrintWriter(bout2);
        
        System.out.println("enter 5 names");
        
        for(i=0;i<5;i++)
        {
            s2=dr.readLine();
             pout2.println(s2);
        }
        pout2.close();
        
        String a[]=new String[10];
        
        FileReader fout3=new FileReader("text1.txt");
        BufferedReader bout3=new BufferedReader(fout3);
        while((s1=bout3.readLine())!=null)
        {
            a[b]=s1;
            b++;
        }
        bout3.close();
        
        FileReader fout4=new FileReader("text2.txt");
        BufferedReader bout4=new BufferedReader(fout4);
        while((s1=bout4.readLine())!=null)
        {
            a[b]=s1;
            b++;
        }
        bout4.close();
        l=a.length;
        for(i=0;i<l;i++)
        {
            for(j=0;j<l-i-1;j++)
            {
                if((a[j].compareTo(a[j+1]))>0)
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }

        
        //create file
        
        FileWriter fout5=new FileWriter("record.txt");
        BufferedWriter bout5=new BufferedWriter(fout5);
        PrintWriter pout5=new PrintWriter(bout5);
        
        System.out.println("/n Names in ascending order are /n");
        
        for(i=0;i<l;i++)
        {
            System.out.println(a[i]);
            pout5.println(a[i]);
        }
        pout5.close();
    }
}















