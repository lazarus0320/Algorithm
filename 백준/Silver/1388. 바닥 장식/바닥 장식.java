import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
	final int cal;
	final int row;

	public Node(int cal, int row) {
		this.cal = cal;
		this.row = row;
	}
}

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N = 0;
	static int M = 0;
	static char[][] field;
	static boolean[][] visit;
	static Queue<Node> queue = new LinkedList<>();
	static int[] horizonDx = {-1, 1};
	static int[] verticalDy = {1, -1};

	static int bfs(int cal, int row) {
		int count = 0;
		visit[cal][row] = true;
		int startChar = field[cal][row];
		count++;
		Node node = new Node(cal, row);
		queue.add(node);

		while (!queue.isEmpty()) {
			Node curNode = queue.poll();

			if (field[curNode.cal][curNode.row] == startChar) {
				if (field[curNode.cal][curNode.row] == '-') {
					for (int i = 0; i < horizonDx.length; i++) {
						int dx = curNode.row + horizonDx[i];
						if (dx >= 0 && dx < M
							&& field[curNode.cal][dx] == '-' && !visit[curNode.cal][dx]) {
							visit[curNode.cal][dx] = true;
							Node nextNode = new Node(curNode.cal, dx);
							queue.add(nextNode);
						}
					}
				}
				else {
					for (int i = 0; i < verticalDy.length; i++) {
						int dy = curNode.cal + verticalDy[i];
						if (dy >= 0 && dy < N
							&& field[dy][curNode.row] == '|' && !visit[dy][curNode.row]) {
							visit[dy][curNode.row] = true;
							Node nextNode = new Node(dy, curNode.row);
							queue.add(nextNode);
						}
					}
				}
			}

			else {
				break;
			}
		}
		queue.clear();
		return count;
	}

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		field = new char[N][M];
		visit = new boolean[N][M];
		int answer = 0;

		for (int i = 0; i < N; i++) {
			String inputLine = br.readLine();
			field[i] = inputLine.toCharArray();
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (!visit[i][j]) {
					answer += bfs(i, j);
				}
			}
		}

		System.out.println(answer);
	}
}