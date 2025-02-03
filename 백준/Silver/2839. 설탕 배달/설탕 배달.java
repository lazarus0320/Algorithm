import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] dp = new int[5001];
		Arrays.fill(dp, -1);
		dp[3] = 1;
		dp[5] = 1;

		for(int i = 6; i <= 5000; i++) {
			int min = Integer.MAX_VALUE;

			if (dp[i-3] != -1) {
				min = dp[i-3];
			}
			if (dp[i-5] != -1) {
				min = Math.min(min, dp[i-5]);
			}

			if(min != Integer.MAX_VALUE) {
				dp[i] = min + 1;
			}
		}

		System.out.print(dp[N]);
	}

}