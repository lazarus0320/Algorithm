import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int[] arrA = new int[N];
			int[] arrB = new int[M];

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arrA[j] = Integer.parseInt(st.nextToken());
			}

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arrB[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arrA);
			Arrays.sort(arrB);
			System.out.println(solution(N, M, arrA, arrB));
		}

	}

	static int solution(int N, int M, int[] arrA, int[] arrB) {
		int ans = 0;

		int aPoint = 0;
		for (int b : arrB) {
			while (aPoint < N && arrA[aPoint] <= b) {
				aPoint++;
			}
			ans += (N - aPoint);
		}

		return ans;
	}
}