import java.io.*;
    class pattern8
    {
    public static void main()throws IOException
    {
    BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the maximum value for the pattern");
    int a=Integer.parseInt(dr.readLine());
    int i,j;
    for(i=a;i>=1;i--)
    {
    for(j=i;j>=1;j--)
    System.out.print(j+",");
    System.out.println();
    }
    }
    }