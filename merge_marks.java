import java.io.*;
class merge_marks
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        String a,s;
        int n,i,b,z=0,j,x,y;
        
        System.out.println("enter the number of students");
        n=Integer.parseInt(dr.readLine());
        
        String e1[]=new String[n];
        String e2[]=new String[n];
        String e3[]=new String[n];
        //create file eng1.txt
        
        FileWriter fout1=new FileWriter("Eng1.txt");
        BufferedWriter bout1=new BufferedWriter(fout1);
        PrintWriter pout1=new PrintWriter(bout1);
        
        for(i=0;i<n;i++)
        {
            System.out.println("enter the name");
            a=dr.readLine();
            pout1.print(a+" ");
            
            System.out.println("enter the marks obtained in English 1");
            b=Integer.parseInt(dr.readLine());
            pout1.println(b);
        }
        pout1.close();
        
        //create file eng2.txt
        
        FileWriter fout2=new FileWriter("Eng2.txt");
        BufferedWriter bout2=new BufferedWriter(fout2);
        PrintWriter pout2=new PrintWriter(bout2);
        
        for(i=0;i<n;i++)
        {
            System.out.println("enter the name");
            a=dr.readLine();
            pout2.print(a+" ");
            e3[i]=a;
            
            System.out.println("enter the marks obtained in English 1");
            b=Integer.parseInt(dr.readLine());
            pout2.println(b);
        }
        pout2.close();
        
        
        FileReader fout3=new FileReader("Eng1.txt");
        BufferedReader bout3=new BufferedReader(fout3);
        while((a=bout3.readLine())!=null)
        {
            j=a.lastIndexOf(' ');
            s=a.substring(j+1);
            
            e1[z]=s;
            z++;
        }
        bout3.close();
        
        z=0;
        
        FileReader fout4=new FileReader("Eng2.txt");
        BufferedReader bout4=new BufferedReader(fout4);
        while((a=bout4.readLine())!=null)
        {
            j=a.lastIndexOf(' ');
            s=a.substring(j+1);
            
            e2[z]=s;
            z++;
        }
        bout4.close();
        
        //create file english
        
        FileWriter fout5=new FileWriter("Eng.txt");
        BufferedWriter bout5=new BufferedWriter(fout5);
        PrintWriter pout5=new PrintWriter(bout5);
        
        for(i=0;i<n;i++)
        {
            x=Integer.parseInt(e1[i]);
            y=Integer.parseInt(e2[i]);
            
            pout5.println(e3[i]+" "+e2[i]+" "+e1[i]+" "+((x+y)/2));
        }
        pout5.close();
    }
}