import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
	static int N;
	static Queue<Integer> queue = new LinkedList<>();
	static int[] indegree, dp;
	static ArrayList<ArrayList<Integer>> graph;
	static HashMap<Integer, Integer> map = new HashMap<>();
	static int ans = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		indegree = new int[N+1];
		graph = new ArrayList<>();
		dp = new int[N + 1];

		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int time = Integer.parseInt(st.nextToken());
			map.put(i, time);
			dp[i] = time;

			int num = Integer.parseInt(st.nextToken());

			for (int j = 0; j < num; j++) {
				int temp = Integer.parseInt(st.nextToken());
				indegree[i]++;
				graph.get(temp).add(i);
			}
		}

		topologicalSort();

		int maxTime = Integer.MIN_VALUE;
		for (int i = 1; i <= N; i++) {
			maxTime = Math.max(maxTime, dp[i]);
		}
		System.out.print(maxTime);
	}

	static void topologicalSort() {

		for (int i = 1; i <= N; i++) {
			if (indegree[i] == 0) {
				queue.add(i);
			}
		}

		while (!queue.isEmpty()) {
			int now = queue.poll();

			for (int next : graph.get(now)) {
				dp[next] = Math.max(dp[next], dp[now] + map.get(next));
				indegree[next]--;

				if (indegree[next] == 0) {
					queue.add(next);
				}
			}
		}
	}
}
