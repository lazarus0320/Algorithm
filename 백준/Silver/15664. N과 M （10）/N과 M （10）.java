import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static int[] inputArr;
	static int[] grabArr;

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		visited = new boolean[N];
		inputArr = new int[N];
		grabArr = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			inputArr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(inputArr);
		dfs(0, 0);

		System.out.println(sb);
	}

	public static void dfs(int depth, int index) {
		int prev = 0;
		if (depth == M) {
			for (int num : grabArr) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}


		for (int i = 0; i < N; i++) {
			if (!visited[i] && inputArr[i] != prev && i >= index) {
				visited[i] = true;
				grabArr[depth] = inputArr[i];
				prev = inputArr[i];
				dfs(depth + 1, i);
				visited[i] = false;
			}
		}
	}
}