import java.io.*;
    class string_sorting
    {
    public static void main()throws IOException
    {
    BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
    int n,i,j;
    System.out.println("enter the no. of elements");
    n=Integer.parseInt(dr.readLine());
    String s[]=new String[n];
    String t;
    for(i=0;i<n;i++)
    {
    System.out.println("enter the name at index "+i);
    s[i]=dr.readLine();
    }
    System.out.println();
    System.out.println();
    for(i=0;i<n;i++)
    {
    for(j=i+1;j<n;j++)
    {
    if(s[j].compareTo(s[i])<0)
    {
    t=s[i];
    s[i]=s[j];
    s[j]=t;
    }
    }
    System.out.println(s[i]);
    }
    }
    }