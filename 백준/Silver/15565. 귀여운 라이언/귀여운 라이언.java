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
		int left = 0, rian = 0;
		int ans = Integer.MAX_VALUE;

		for (int right = 0; right < N; right++) {
			if (arr[right] == 1) {
				rian++;
			}

			while (rian >= K) {
				ans = Math.min(ans, right - left + 1);

				if (arr[left] == 1) {
					rian--;
				}

				left++;
			}
		}

		return ans == Integer.MAX_VALUE ? -1 : ans;
	}
}