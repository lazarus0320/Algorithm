import java.util.*;
import java.io.*;

class Main {
	static int K, N;
	static int[] arr;
	static String[] titles;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		K = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		arr = new int[K];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.print(solution(max));

	}

	static long solution(int max) {
		long left = 1, right = max, ans = 0;

		while (left <= right) {
			long mid = left + (right - left) / 2;
			long count = counter(mid);

			if (count >= N) {
				ans = mid;
				left = mid + 1;

			}
			else {
				right = mid - 1;
			}
		}

		return ans;
	}

	static long counter(long mid) {
		long count = 0;

		for (int num : arr) {
			count += num / mid;
		}
		return count;
	}
}