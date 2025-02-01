import java.util.*;
import java.io.*;

class Main {
	static int N, M;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int max = 0;

		arr = new int[M];
		for (int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]);
		}

		System.out.print(solution(max));


	}

	static long solution(int max) {
		int left = 1, right = max, ans = 0;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (counter(mid) <= N) {
				ans = mid;
				right = mid - 1;

			} else {
				left = mid + 1;
			}
		}

		return ans;
	}

	static int counter(int mid) {
		int count = 0;
		for (int i = 0; i < M; i++) {
			count += arr[i] / mid;

			if (arr[i] % mid != 0) {
				count++;
			}
		}

		return count;
	}

}