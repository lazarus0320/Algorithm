import java.util.*;
import java.io.*;

class Main {
	static int N, X;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		arr = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		solution();
	}

	static void solution() {
		int sum = 0, sumCount = 0;

		for (int i = 0; i < X; i++) {
			sum += arr[i];
		}

		int max = sum;
		sumCount++;

		for (int i = 1; i <= N - X; i++) {
			sum = sum - arr[i - 1] + arr[i + X - 1];

			if (max < sum) {
				max = sum;
				sumCount = 1;
			}
			else if (sum == max) {
				sumCount++;
			}
		}


		if (max == 0) {
			System.out.println("SAD");
		}
		else {
			System.out.println(max);
			System.out.println(sumCount);
		}
	}
}