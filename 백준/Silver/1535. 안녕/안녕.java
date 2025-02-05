import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] hpArr = new int[N+1]; // 체력 소모
		int[] happyArr = new int[N+1]; // 기쁨

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			hpArr[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			happyArr[i] = Integer.parseInt(st.nextToken());
		}

		int[][] dp = new int[N + 1][101];

		for (int i = 1; i <= N; i++) {
			int hpCost = hpArr[i];
			int happy = happyArr[i];

			for (int j = 1; j <= 100; j++) {
				// 이전 상태 그대로 가져오기
				dp[i][j] = dp[i-1][j];

				// 현재 체력으로 인사할 수 있고, 인사 후에도 체력이 1 이상 남는 경우
				if (j >= hpCost && j - hpCost > 0) {
					dp[i][j] = Math.max(dp[i][j], dp[i-1][j-hpCost] + happy);
				}
			}
		}

		System.out.print(dp[N][100]);
	}
}