import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Solution {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	


	public static void main(String[] args) throws IOException {
		
		int T = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= T; test++) {
			int N = Integer.parseInt(br.readLine());
			
			long[][] dp = new long[N][N];
			
			dp[0][0] = 1;
			
			for (int i = 1; i < N; i++) {
				dp[i][0] = 1;
				
				for (int j = 1; j <= i; j++) {
					dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
				}
			}
			
		
			System.out.println("#" + test);
		
			for (int i = 0; i < dp.length; i++) {
				
				for (int j = 0; j <= i; j++) {
					
					System.out.print(dp[i][j] + " ");
				}
				
				System.out.println();
			}
		}
	}
}
