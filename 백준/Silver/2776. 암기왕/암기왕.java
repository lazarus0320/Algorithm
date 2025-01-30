import java.util.*;
import java.io.*;

class Main {
	static int N, M;
	static int[] arr1, arr2;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for (int cycle = 0; cycle < T; cycle++) {
			N = Integer.parseInt(br.readLine());
			arr1 = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				arr1[i] = Integer.parseInt(st.nextToken());
			}

			M = Integer.parseInt(br.readLine());
			arr2 = new int[M];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < M; i++) {
				arr2[i] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(arr1);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < M; i++) {
				sb.append(solution(arr2[i])).append("\n");
			}
			System.out.print(sb);
		}
	}

	static int solution(int num) {
		int left = 0, right = N-1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr1[mid] == num) {
				return 1;
			}
			else if (arr1[mid] < num){
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return 0;
	}
}