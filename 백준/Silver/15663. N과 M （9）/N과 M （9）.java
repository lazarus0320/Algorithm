import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] arr;
	static int[] answer;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int M;

	static void dfs(int depth) {
		int prev = 0;
		if (depth == M) {
			for (int num : answer) {
				sb.append(num).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (!visited[i] && arr[i] != prev) {
				visited[i] = true;
				answer[depth] = arr[i];
				prev = arr[i];
				dfs(depth + 1);
				visited[i] = false;
			}


		}

	}

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N];
		answer = new int[M];

		int max = Integer.MIN_VALUE;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		visited = new boolean[N];

		Arrays.sort(arr);
		dfs(0);

		System.out.println(sb);
	}
}