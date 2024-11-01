import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int[][] graph;
	static int[] visited;
	static int V;
	static int N;
	static int M;
	static Queue<Integer> queue = new LinkedList<>();

	public static void dfs(int V) {
		visited[V] = 1;
		System.out.print(V + " ");
		for (int i = 1; i <= N; i++) {
			if (graph[V][i] == 1 && visited[i] == 0) {
				dfs(i);
			}
 		}
	}

	public static void bfs(int V) {
		queue.add(V);
		visited[V] = 1;

		while (!queue.isEmpty()) {
			int node = queue.remove();
			System.out.print(node + " ");

			for (int i = 1; i <= N; i++) {
				if (graph[node][i] == 1 && visited[i] == 0) {
					queue.add(i);
					visited[i] = 1;
				}
			}
		}


	}



	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());

		graph = new int[N+1][N+1];
		visited = new int[N+1];

		for (int i = 0; i < M; i++) {
			StringTokenizer stNode = new StringTokenizer(br.readLine());
			int firstNode = Integer.parseInt(stNode.nextToken());
			int secondNode = Integer.parseInt(stNode.nextToken());

			graph[firstNode][secondNode] = graph[secondNode][firstNode] = 1;
		}

		dfs(V);
		System.out.println();

		visited = new int[N+1];
		bfs(V);
	}

}