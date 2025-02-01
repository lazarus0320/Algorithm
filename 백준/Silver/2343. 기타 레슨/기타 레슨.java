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
		int maxLen = 0, sum = 0;

		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			maxLen = Math.max(maxLen, arr[i]);
			sum += arr[i];
		}

		System.out.print(solution(maxLen , sum));


	}

	static long solution(int maxLen, int sum) {
		int left = maxLen, right = sum, ans = 0;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (counter(mid) <= M) {
				ans = mid;
				right = mid - 1;

			} else {
				left = mid + 1;
			}
		}

		return ans;
	}

	static int counter(int mid) {
		int count = 1;
		int sum = 0;
		for (int num : arr) {
			if (sum + num > mid) {
				count++;
				sum = num;
			}
			else {
				sum += num;
			}

		}

		return count;
	}

}