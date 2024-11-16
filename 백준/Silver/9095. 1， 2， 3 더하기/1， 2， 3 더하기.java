import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		
		int T = Integer.parseInt(br.readLine());
		
		
		for (int test = 1; test <= T; test++) {
			
			int N = Integer.parseInt(br.readLine());
			
			int[] dp = new int[N+3];
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 4;
			
			for (int i = 4; i <= N; i++) {
				
				dp[i] = dp[i-3] + dp[i-2] + dp[i-1];

				
			}
			
			System.out.println(dp[N]);
		}
		
	}
}
