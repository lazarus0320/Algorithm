import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int testCase, N;
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

		testCase = Integer.parseInt(st.nextToken());

		for (int i = 0; i < testCase; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st2.nextToken());

			graph = new int[N + 1][N + 1];
			visited = new int[N + 1];

			String input = br.readLine();
			String[] numStrArr = input.split(" ");

			for (int j = 0; j < N; j++) {
				int num = Integer.parseInt(numStrArr[j]);
				graph[j+1][num] = graph[num][j+1] = 1;
			}


			int result = 0;
			for (int j = 1; j <= N; j++) {
				if (visited[j] == 0) {
					dfs(j);
					result++;
				}

			}

			System.out.println(result);
		}
	}

}