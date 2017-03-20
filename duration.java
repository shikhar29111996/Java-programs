import java.io.*;
    class duration
    {
            public static void main()throws IOException
            {
                BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
                int n,i;
                System.out.println("enter the number of people logging in");
                n=Integer.parseInt(dr.readLine());
                String user[]=new String[n];
                int logdatem[]=new int[n];
                int logdated[]=new int[n];
                int logtimeh[]=new int[n];
                int logtimem[]=new int[n];
                for(i=0;i<n;i++)
                {
                    System.out.println("enter the name");
                    user[i]=dr.readLine();
                    System.out.println("enter the log in date(in days)");
                    logdated[i]=Integer.parseInt(dr.readLine());
                    System.out.println("enter the log in date(in month)");
                    logdatem[i]=Integer.parseInt(dr.readLine());
                    System.out.println("enter the log in time(in minutes)");
                    logtimem[i]=Integer.parseInt(dr.readLine());
                    System.out.println("enter the log in time(in hours)");
                    logtimeh[i]=Integer.parseInt(dr.readLine());
                }
                System.out.println("\n \n \n \n \n \n");
                System.out.println(" user \t log in date(d) \t log in date(m) \t log out time(h) \t log out time(m)");
                for(i=0;i<n;i++)
                {
                    System.out.println(user[i]+" \t "+logdated[i]+" \t "+logdatem[i]+" \t "+logtimeh[i]+" \t "+logtimem[i]);
                }
               }
               }