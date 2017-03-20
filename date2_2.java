import java.io.*; 
class date2_2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String date,day,mon,year;int d,m,y,c=0,i,s=0;
        String date2,day2,mon2,year2;int d2,m2,y2,s2=0;
        int da[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        while(true)
        {
            System.out.println("enter the  two dates in format dd/mm/yyyy");
            date=br.readLine();
            date2=br.readLine();
            day=date.substring(0,date.indexOf('/'));
            mon=date.substring((date.indexOf('/')+1),date.lastIndexOf('/'));
            year=date.substring(date.lastIndexOf('/')+1);

            day2=date2.substring(0,date2.indexOf('/'));
            mon2=date2.substring((date2.indexOf('/')+1),date.lastIndexOf('/'));
            year2=date2.substring(date2.lastIndexOf('/')+1);
    
            d=Integer.parseInt(day);
            m=Integer.parseInt(mon);
            y=Integer.parseInt(year);

            d2=Integer.parseInt(day2);
            m2=Integer.parseInt(mon2);
            y2=Integer.parseInt(year2);

            if(y%4==0)
            da[2]=29;
            if(year.length()<4||year2.length()<4)
            {
                System.out.println("re-enter the date in format dd/mm/yyyy");
                continue;
            }
            if((d<1||d>da[m])||(d2<1||d2>da[m]))
            {
                System.out.println("re-enter the date in format dd/mm/yyyy");
                continue;
            }
            else if((m<1||m>12)||(m2<1||m2>12))
            {
                System.out.println("re-enter the date in format dd/mm/yyyy");
                continue;
            }
            else if(y==0||y2==0)
            {
                System.out.println("re-enter the date in format dd/mm/yyyy");
                continue;
            }
            else 
            {
                c=1;
                break;
            }
        }
        if(c==1)
        {
            for(i=1;i<m;i++)
            {
                s=s+da[i];
            }
            s=s+d;
   
   

            for(i=1;i<m2;i++)
            {
                s2=s2+da[i];
            }
            s2=s2+d2;
            System.out.println("the no. of day ="+(s2-s));
        }
    }
}