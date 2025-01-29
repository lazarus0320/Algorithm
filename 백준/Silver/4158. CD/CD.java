import java.util.*;
import java.io.*;

class Main {
	static int N, M;
	static int[] arr1, arr2;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());

			if (N == 0 && M == 0) {
				break;
			}

			arr1 = new int[N];
			arr2 = new int[N];

			for (int i = 0; i < N; i++) {
				arr1[i] = Integer.parseInt(br.readLine());
			}

			for (int i = 0; i < M; i++) {
				arr2[i] = Integer.parseInt(br.readLine());
			}

			System.out.println(solution());
		}

	}

	static int solution() {
		int idx1 = 0, idx2 = 0, ans = 0;

		while (idx1 < N && idx2 < M) {
			if (arr1[idx1] == arr2[idx2]) {
				idx1++;
				idx2++;
				ans++;
			}
			else if (arr1[idx1] < arr2[idx2]) {
				idx1++;
			}
			else {
				idx2++;
			}
		}

		return ans;
	}
}