import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N = 0;
	static int M = 0;
	static int[] graph;
	static boolean[] visit;

	static int dfs(int node, int startNode) {
		int count = 0;
		visit[node] = true;
		int nextNode = graph[node];

		if (nextNode == 0) {
			return 0;
		}
		if (startNode == nextNode) {
			return 1;
		}
		if (!visit[nextNode]) {
			count = dfs(nextNode, startNode);
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());

		for (int cycle = 0; cycle < T; cycle++) {
			int N = Integer.parseInt(br.readLine());
			int answer = 0;
			visit = new boolean[N+1];
			graph = new int[N+1];
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int i = 1; i <= N; i++) {
				int num = Integer.parseInt(st.nextToken());
				graph[i] = num;
			}

			for (int i = 1; i <= N; i++) {
				if (!visit[i]) {
					answer += dfs(i, i);
				}
			}
			System.out.println(answer);
		}
	}
}