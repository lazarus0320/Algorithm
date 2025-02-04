import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long dp[] = new long[10000001];

		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i <= N; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 10;
		}

		System.out.print(dp[N]);
	}
}