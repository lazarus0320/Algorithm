import java.util.*;
import java.io.*;

class Main {
	static int M, N;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		int maxLen = 0;

		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			maxLen = Math.max(maxLen, arr[i]);
		}

		System.out.print(solution(maxLen));


	}

	static long solution(int maxLen) {
		long left = 1, right = maxLen, ans = 0;

		while (left <= right) {
			long mid = left + (right - left) / 2;
			if (counter((int)mid) >= M) {
				ans = mid;
				left = mid + 1;

			} else {
				right = mid - 1;
			}
		}

		return ans;
	}

	static int counter(int mid) {
		int count = 0;
		for (int i = 0; i < N; i++) {
			count += arr[i] / mid;
		}
		return count;
	}
}