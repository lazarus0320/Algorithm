import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.parseInt(br.readLine());
		
		
		int[] dp = new int[1003];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 3;
		
		for (int i = 4; i <= N; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 10007;
		}
		
		
		System.out.println(dp[N]);
		
		
	}
}
