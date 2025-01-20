import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N, S, ans;
	static int[] inputArr, grabArr;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());

		inputArr = new int[N];
		grabArr = new int[N];
		visited = new boolean[N];
		ans = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			inputArr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i <= N; i++) {
			dfs(0, 0, i);
		}

		System.out.println(ans);

	}

	public static void dfs(int depth, int index, int maxGrab) {
		if (depth == maxGrab) {
			int sum = 0;
			for (int num : grabArr) {
				sum += num;
			}

			if (sum == S) {
				ans++;
			}
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visited[i] && index <= i) {
				visited[i] = true;
				grabArr[depth] = inputArr[i];
				dfs(depth+1, i, maxGrab);
				visited[i] = false;
			}
		}
	}
}