import java.util.*;
import java.io.*;

class Main {
	static final int MOD = 1000000000;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long dp[] = new long[1000001];

		if (N == 0) {
			System.out.println(0);
			System.out.println(0);
			return;
		}
		dp[1] = 1;

		for (int i = 2; i <= Math.abs(N); i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % MOD;
		}

		if (N < 0 && Math.abs(N) % 2 == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(1);
		}
		System.out.print(dp[Math.abs(N)]);
	}
}