import java.util.*;
import java.io.*;

class Main {
	static int N, M;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());

		arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		System.out.print(solution());

	}

	static int solution() {
		int start = 0, end = N-1, ans = 0;

		while (start < end) {
			int sum = arr[start] + arr[end];

			if (sum > M) {
				end--;
			}

			else if (sum < M) {
				start++;
			}

			else {
				ans++;
				start++;
				end--;
			}
		}
		return ans;
	}
}