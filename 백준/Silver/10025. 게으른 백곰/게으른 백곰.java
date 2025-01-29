import java.util.*;
import java.io.*;

class Main {
	static int N, K;
	static int[][] ice; // [위치, 얼음양]

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		ice = new int[N][2];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int g = Integer.parseInt(st.nextToken()); // 얼음양
			int x = Integer.parseInt(st.nextToken()); // 위치
			ice[i][0] = x;
			ice[i][1] = g;
		}

		// 위치 기준 정렬
		Arrays.sort(ice, (a, b) -> a[0] - b[0]);

		System.out.println(solution());
	}

	static int solution() {
		int maxSum = 0;
		int currentSum = 0;
		int left = 0;

		// 각 위치를 시작점으로 잡고
		for (int right = 0; right < N; right++) {
			currentSum += ice[right][1];

			// 왼쪽 포인터가 범위를 벗어나면 이동
			while (left <= right && ice[right][0] - ice[left][0] > 2 * K) {
				currentSum -= ice[left][1];
				left++;
			}

			maxSum = Math.max(maxSum, currentSum);
		}

		return maxSum;
	}
}