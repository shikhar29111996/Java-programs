import java.io.*;
class Create_file
{
    public static void main(String args[])throws IOException
    {
        String n;
        int i;
        
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        FileWriter fout=new FileWriter("stud.txt");
        BufferedWriter bout=new BufferedWriter(fout);
        PrintWriter pout=new PrintWriter(bout);
        
        for(i=1;i<=5;i++)
        {
            System.out.println("enter the "+i+" name");
            n=dr.readLine();
            pout.println(n);
        }
        pout.close();
    }
}