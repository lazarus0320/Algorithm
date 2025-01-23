import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
	static int numOfMan;
	static int cycle;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] indegree;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		numOfMan = Integer.parseInt(st.nextToken());
		cycle = Integer.parseInt(st.nextToken());

		indegree = new int[numOfMan+1];
		graph = new ArrayList<>();

		for (int i = 1; i <= numOfMan+1; i++) {
			graph.add(new ArrayList<>());
		}


		for (int i = 0; i < cycle; i++) {
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());

			graph.get(first).add(second);
			indegree[second]++;
		}

		topologySort();

	}

	private static void topologySort() {
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();

		// 진입차수가 0인 노드 큐에 삽입
		for (int i = 1; i <= numOfMan; i++) {
			if (indegree[i] == 0) {
				queue.add(i);
			}
		}

		while (!queue.isEmpty()) {
			int now = queue.poll();
			sb.append(now).append(" ");

			for (int next : graph.get(now)) {
				indegree[next]--;
				if (indegree[next] == 0) {
					queue.add(next);
				}
			}
		}
		System.out.print(sb);
	}

}
