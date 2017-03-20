package Special;

import java.io.*;
 
public class Elephant_magic
{
 
 
	private static int levelP(int [][] A, int p, short [][][][][] sol){
		int n = A.length;
		int m = A[0].length;
		for (int addRow = 0; addRow < 2; addRow++)
			for (int addCol = 0; addCol < 2; addCol++)
				for (int i = 0; i < 10; i++)
					sol[1][1][addRow][addCol][i] = (short)(((A[0][0] + (addRow+addCol)*p) % 10) >= i ? 1 : 0);
		for (int i = 0; i < n; i++){
			short [][][][] curRow = sol[i+1];
			for (int j = 0; j < m; j++){
				if ((i == 0) && (j == 0))
					continue;
				short [][][] lastRow = sol[i][j+1];
				short [][][] lastCol = curRow[j];
				short [][][] curCell = curRow[j+1];
				for (int addRow = 0; addRow < 2; addRow++){
					for (int addCol = 0; addCol < 2; addCol++){
						int val = (A[i][j] + (addCol+addRow)*p)%10;
						short [] curCell2 = curCell[addRow][addCol];
						short [] lastRow0 = lastRow[0][addCol];
						short [] lastRow1 = lastRow[1][addCol];
						short [] lastCol0 = lastCol[addRow][0];
						short [] lastCol1 = lastCol[addRow][1];
						short bestWhenUse = (short)(1 + Math.max(
							Math.max(lastRow0[val], lastRow1[val]),
							Math.max(lastCol0[val], lastCol1[val])));
						for (int k = 0; k < 10; k++){
							int best = Math.max(
								Math.max(lastRow0[k], lastRow1[k]),
								Math.max(lastCol0[k], lastCol1[k]));
							if (val >= k)
								best = Math.max(best, bestWhenUse);
							curCell2[k] = (short)best;
						}
					}
				}
			}
		}
		return Math.max(Math.max(
			sol[n][m][0][0][0],
			sol[n][m][0][1][0]),
			Math.max(
			sol[n][m][1][0][0],
			sol[n][m][1][1][0]));
	}
	
	public static void main(String [] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int testCount = Integer.parseInt(in.readLine());
		short [][][][][] sol = new short[101][101][2][2][10];
		for (int test = 0; test < testCount; test++){
			String [] sizes = in.readLine().split(" ");
			int n = Integer.parseInt(sizes[0]);
			int m = Integer.parseInt(sizes[1]);
			
			int [][] A = new int[n][m];
			for (int i = 0; i < n; i++){
				String line = in.readLine();
				for (int j = 0; j < m; j++)
					A[i][j] = line.charAt(j) - '0';
			}
 
			int result = 0;
			for (int i = 1; i < 10; i++){
				result = Math.max(result, levelP(A, i, sol));
			}
			System.out.println(""+result);
		}
	}
 
 
} 

