package Special;


import java.util.*;
import java.io.*;
public class A_String_Game {
    static ArrayList dic = new ArrayList();
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static String s;
    static Integer memo[][];
 
    static int fin(int a,int b){
        if(a>=b)
            return 0;
        if(memo[a][b]!=null)
            return memo[a][b];
        boolean bit[] = new boolean[1000];
        for(int i=a;i<b;i++){
                for(int j=i+1;j<=b;j++){
                    if(dic.contains(s.substring(i,j))){
                        bit[fin(a,i)^fin(j,b)]=true;
                    }
                }
        }
        for(int i=0;;i++)
            if(!bit[i])
                return memo[a][b]=i;
     
    }
    public static void main(String args[]) throws IOException{
        int t = Integer.parseInt(in.readLine());
        while(t!=0){
            s = in.readLine();
            int n = Integer.parseInt(in.readLine());
            dic.clear();
            for(int i=0;i<n;i++){
                dic.add(in.readLine());
            }
            memo = new Integer[s.length()][s.length()+1];
 
            out.println(fin(0,s.length())==0 ?  "Tracy" : "Teddy");
            t--;
        }
        out.close();
    }
}
 