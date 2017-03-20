package Special;

import java.util.*;
import java.io.*;
 
public class Treasure_hunt {
	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int tests = Integer.parseInt(rd.readLine());
		for(int x=0; x<tests; x++){
			curTest = 1+x;
			rd.readLine();
			int n = Integer.parseInt(rd.readLine());
			char[][] A = new char[n][n];
			ArrayList<Integer> X = new ArrayList<Integer>(), Y = new ArrayList<Integer>();
			for(int i=0; i<n; i++){
				String S = rd.readLine();
				for(int j=0; j<n; j++){
					A[i][j] = S.charAt(j);
					if(A[i][j]=='*'){
						X.add(i);
						Y.add(j);
					}
				}
			}
			X.add(n-1);
			Y.add(n-1);
			num = X.size();
			dist = new int[num][num];
			for(int i=0; i<num; i++){
				for(int j=0; j<num; j++){
					dist[i][j] = distance(X.get(i), Y.get(i), X.get(j), Y.get(j), n, A);
				}
			}
			int best = 1000000000;
			int d, f;
			for(int i=0; i<num-1; i++){
				if((d = distance(0, 0, X.get(i), Y.get(i), n, A))!=-1 && (f = find((1<<i), i))!=-1)
					best = Math.min(best, d + f);
			}
			if(best<1000000000) pw.println(best);
			else pw.println(-1);
		}
		pw.flush();
	}
	
	static int find(int mask, int last){
		if(found[mask][last]==curTest) return dp[mask][last];
		if(mask==(1<<(num-1))-1){
			found[mask][last] = curTest;
			return dp[mask][last] = dist[last][num-1];
		}
		int best = 1000000000;
		for(int i=0; i<num-1; i++){
			if((mask&(1<<i))==0 && dist[last][i]!=-1){
				int cur = find((mask^(1<<i)), i);
				if(cur==-1) continue;
				cur += dist[last][i];
				best = Math.min(best, cur);
			}
		}
		
		int ans = (best<1000000000? best: -1);
		found[mask][last] = curTest;
		return dp[mask][last] = ans;
	}
	
	static int[][] dist;
	static int num;
	
	static int[][] dp = new int[1<<15][16];
	
	static int[][] found = new int[1<<15][16];
	
	static int curTest = 1;
	
	static int[] dx = new int[]{0, 0, -1, 1}, dy = new int[]{-1, 1, 0, 0};
	
	static int distance(int x, int y, int x1, int y1, int n, char[][] A){
		boolean[][] been = new boolean[n][n];
		Queue<Integer> X = new LinkedList<Integer>(), Y = new LinkedList<Integer>(), D = new LinkedList<Integer>();;
		X.add(x);
		Y.add(y);
		D.add(0);
		been[x][y] = true;
		while(!X.isEmpty()){
			int curX = X.poll(), curY = Y.poll(), dist = D.poll();
			if(curX==x1 && curY==y1) return dist;
			for(int i=0; i<4; i++){
				int nowX = curX + dx[i], nowY = curY + dy[i];
				if(in(nowX, nowY, n) && !been[nowX][nowY] && A[nowX][nowY]!='#'){
					been[nowX][nowY] = true;
					X.add(nowX);
					Y.add(nowY);
					D.add(1+dist);
				}
			}
		}
		return -1;
	}
	
	static boolean in(int a, int b, int n){
		return a>=0 && b>=0 && a<n && b<n;
	}
	
}