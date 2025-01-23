import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
	static int N, M;
	static int[] indegree;
	static ArrayList<ArrayList<Integer>> graph;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		graph = new ArrayList<>();
		indegree = new int[N+1];
		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());

			graph.get(first).add(second);
			indegree[second]++;
		}

		topologicalSort();
	}

	static void topologicalSort() {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= N; i++) {
			if (indegree[i] == 0) {
				pq.add(i);
			}
		}

		while (!pq.isEmpty()) {
			int now = pq.poll();
			sb.append(now).append(" ");

			for (int next : graph.get(now)) {
				indegree[next]--;
				if (indegree[next] == 0) {
					pq.add(next);
				}
			}
		}

		System.out.print(sb);
	}
}
