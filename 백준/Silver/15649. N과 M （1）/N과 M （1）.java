import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] arr;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int M;

	static void dfs(int depth) {
		if (depth == M) {
			for (int num : arr) {
				sb.append(num).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = i;
				dfs(depth + 1);
				visited[i] = false;
			}


		}

	}

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[M];
		visited = new boolean[N+1];

		dfs(0);

		System.out.println(sb);
	}
}