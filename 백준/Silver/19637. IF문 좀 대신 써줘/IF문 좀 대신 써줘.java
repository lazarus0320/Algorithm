import java.util.*;
import java.io.*;

class Main {
	static int N, M;
	static int[] arr;
	static String[] titles;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N];
		titles = new String[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			titles[i] = st.nextToken();
			arr[i] = Integer.parseInt(st.nextToken());
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(br.readLine());
			sb.append(solution(num)).append("\n");
		}

		System.out.println(sb);

	}

	static String solution(int num) {
		int left = 0, right = N - 1, idx = 0;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] >= num) {
				idx = mid;
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}

		return titles[idx];
	}
}