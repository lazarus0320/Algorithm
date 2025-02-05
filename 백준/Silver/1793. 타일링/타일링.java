import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";

		// DP 배열 초기화
		BigInteger[] dp = new BigInteger[251];
		dp[0] = BigInteger.ONE;
		dp[1] = BigInteger.ONE;
		dp[2] = new BigInteger("3");

		for (int i = 3; i < 251; i++) {
			dp[i] = dp[i-1].add(dp[i-2].multiply(BigInteger.valueOf(2)));
		}

		// EOF까지 입력 받기
		while ((input = br.readLine()) != null) {
			int N = Integer.parseInt(input);
			System.out.println(dp[N]);
		}
	}
}