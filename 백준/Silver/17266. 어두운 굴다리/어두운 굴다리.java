import java.util.*;
import java.io.*;

class Main {
	static int N, M;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());

		arr = new int[M];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.print(solution());
	}

	static long solution() {
		int left = 1, right = N, ans = 0;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (isPossible(mid)) {
				ans = mid;
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}

		return ans;
	}

	static boolean isPossible(int height) {

		if (arr[0] - height > 0 || arr[M - 1] + height < N) return false;

		for (int i = 0; i < M - 1; i++) {
			if (arr[i] + height < arr[i+1] - height) return false;
		}

		return true;
	}
}