import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long dp[] = new long[36];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i < 36; i++) {
			for (int j = 0; j < i; j++) {
				dp[i] += dp[j] * dp[i-j-1];
			}
		}
		System.out.println(dp[N]);
	}

}