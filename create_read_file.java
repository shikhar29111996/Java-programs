import java.io.*;
class create_read_file
{
    public static void main()throws IOException
    {
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        String s1;
        
        //create a file
        
        FileWriter fout1=new FileWriter("lower.txt");
        BufferedWriter bout1=new BufferedWriter(fout1);
        PrintWriter pout1=new PrintWriter(bout1);
        
        System.out.println("enter the String");
        s1=dr.readLine();
        
        pout1.println(s1);
        pout1.close();
        
        //reading a file
        
        FileReader fout2=new FileReader("lower.txt");
        BufferedReader bout2=new BufferedReader(fout2);
        
        String s2;
        
        //create a new file
        
        FileWriter fout3=new FileWriter("upper.txt");
        BufferedWriter bout3=new BufferedWriter(fout3);
        PrintWriter pout3=new PrintWriter(bout3);
        
        while((s2=bout2.readLine())!=null)
        {
            System.out.println("/n"+s2);
            s2=s2.toUpperCase();
            pout3.println(s2);
        }
        pout3.close();  
        bout2.close();
        
    }
}