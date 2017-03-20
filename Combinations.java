public class Combinations
{  
   
  public Combinations()
  {  
   
    String str_arr[]={"a","b","c"};  
    GenCombinations(str_arr);  
  }
  public void GenCombinations(String[] str_arr)
  {  
      int a=1;
   
    System.out.println("Generating All possible Combinations for  the following "+str_arr.length+" strings.");          
   
    
   
    /*COMBINATIONS OF LENGTH THREE*/  
    for(int i=0;i<str_arr.length;i++)  
     {  
      for(int j=0;j<str_arr.length;j++)  
       {  
        for(int k=0;k<str_arr.length;k++)  
         {    
             if(str_arr[i]!=str_arr[j]&&str_arr[i]!=str_arr[k]&&str_arr[j]!=str_arr[k])
             {
                 
            System.out.println(a+"-"+str_arr[i]+""+str_arr[j]+""+str_arr[k]);  
            a++;
        }
         }  
       }  
     }  
  }   
   
   
  public static void main(String[] args)
  {  
   
    new Combinations();  
  }  
}  