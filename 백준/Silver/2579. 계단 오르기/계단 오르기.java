import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.parseInt(br.readLine());
		int[] stair = new int[301];
		
		for (int i = 1; i <= N; i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}
		
		int[] dp = new int[301];
		
		dp[1] = stair[1];
		dp[2] = stair[1] + stair[2];
		dp[3] = stair[3] + Math.max(stair[1], stair[2]);
		
		for (int i = 4; i <= N; i++) {
			dp[i] = Math.max(stair[i-1] + dp[i-3], dp[i-2]) + stair[i];
		}
		
		System.out.println(dp[N]);
		
		
	}
}
