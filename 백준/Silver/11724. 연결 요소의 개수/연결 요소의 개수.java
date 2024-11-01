import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[][] graph;
	static int[] visited;
	static Queue<Integer> queue = new LinkedList<>();

	public static void dfs(int startNode) {
		visited[startNode] = 1;

		for (int i = 1; i <= N; i++) {
			if (graph[startNode][i] == 1 && visited[i] == 0) {
				dfs(i);
			}
		}
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		graph = new int[N + 1][N + 1];
		visited = new int[N + 1];

		for (int i = 0; i < M; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int firstNode = Integer.parseInt(st2.nextToken());
			int secondNode = Integer.parseInt(st2.nextToken());

			graph[firstNode][secondNode] = graph[secondNode][firstNode] = 1;
		}

		int result = 0;
		for (int i = 1; i <= N; i++) {
			if (visited[i] == 0) {
				dfs(i);
				result++;
			}

		}

		System.out.println(result);
	}

}