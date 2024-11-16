import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Solution {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	public static void main(String[] args) throws IOException {
		
		int T = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= T; test++) {
			
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input, " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int[][] board = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				String rowInput = br.readLine();
				st = new StringTokenizer(rowInput, " ");
				
				for (int j = 0; j < N; j++) {
					board[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int result = 0;
			
			for (int i = 0; i <= N-M; i++) {
				
				for (int j = 0; j <= N-M; j++) {
					
					int killedFly = 0;
					
					for (int k = 0; k < M; k++) {
						
						
						
						for (int l = 0; l < M; l++) {
							
							killedFly += board[i+k][j+l];
						}	
				
					}
					
					result = Math.max(result, killedFly);
				}
			
				
			}
			
			System.out.println("#" + test + " " + result);
		}
	}
}
