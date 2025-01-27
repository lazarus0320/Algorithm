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

		System.out.println(solution());

	}

	static int solution() {
		int ans = Integer.MIN_VALUE;
		int start = 0, end = 0;
		int[] count = new int[100001];

		while (end < N) {
			count[arr[end]]++;

			while (count[arr[end]] > K) {
				count[arr[start]]--;
				start++;
			}

			ans = Math.max(ans, end - start + 1);
			end++;
		}

		return ans;
	}
}