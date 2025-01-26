import java.util.*;
import java.io.*;

class Main {
	static int N, K;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		arr = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.print(solution());

	}

	static int solution() {
		int sum = 0;

		for (int i = 0; i < K; i++) {
			sum += arr[i];
		}

		int max = sum;

		for (int i = 1; i < N - K + 1; i++) {
			sum = sum - arr[i-1] + arr[i+K-1];

			max = Math.max(sum, max);

		}

		return max;
	}
}