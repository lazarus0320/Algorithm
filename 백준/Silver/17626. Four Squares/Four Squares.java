import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		long dp[] = new long[50001];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[1] = 1;
		dp[2] = 2;


		for (int i = 3; i <= N; i++) {
			if ((int)Math.sqrt(i) * (int)Math.sqrt(i) == i) {
				dp[i] = 1;
				continue;
			}

			for (int j = 1; j*j <= i; j++) {
				int temp = i - (j * j);
				dp[i] = Math.min(dp[i], dp[temp] + 1);
			}
		}

		System.out.print(dp[N]);
	}
}