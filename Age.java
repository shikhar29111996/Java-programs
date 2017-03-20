import java.util.*;
import java.io.*;
 
class Age
{
    public static void main(String args[])throws IOException
    {
       
        BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
        
        int d1,m1,y1,d2,m2,y2,d3=0,m3,y3;
        GregorianCalendar date = new GregorianCalendar();
  
        d1=date.get(Calendar.DAY_OF_MONTH);
        m1=date.get(Calendar.MONTH);
        y1=date.get(Calendar.YEAR);
       
        m1=m1+1;
  
        System.out.println("Current date is  "+d1+"/"+m1+"/"+y1);
        
        System.out.println("enter your date of birth");
        d2=Integer.parseInt(dr.readLine());
        
        System.out.println("enter your Month of birth");
        m2=Integer.parseInt(dr.readLine());
        
        System.out.println("enter your Year of birth");
        y2=Integer.parseInt(dr.readLine());
        
        System.out.println("Yore date of birth is  "+d2+"/"+m2+"/"+y2);
        
        if(m1>=m2)
        {
            y3=y1-y2;
            m3=m1-m2;
        }
        
        else
        {
            y3=(y1-y2)-1;
            m3=12-(m2-m1);
        }
        
        
        if(m1==m2)
        {
            if(d2>d1)
            {
                d3=d2-d1;
            }
            
            else
            {
                if(m1==1||m1==3||m1==5||m1==7||m1==8||m1==10||m1==12)
                {
                    d3=31-(d1-d2);
                }
                
                else if(m1==4||m1==6||m1==9||m1==11)
                {
                    d3=30-(d1-d2);
                }
                
                else
                {
                    d3=29-(d1-d2);
                }
            }
        }
        
        