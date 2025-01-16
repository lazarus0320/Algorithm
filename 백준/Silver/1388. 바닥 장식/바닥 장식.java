import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N = 0;
	static int M = 0;
	static char[][] field;
	static boolean[][] visit;

	static void dfs(int cal, int row, boolean isRow) {
		visit[cal][row] = true;
		if (isRow) {
			row++;
			if (row < M && field[cal][row] == '-') {
				dfs(cal, row, true);
			}
		}
		else {
			cal++;
			if (cal < N && field[cal][row] == '|') {
				dfs(cal, row, false);
			}
		}
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
				if (visit[i][j]) {
					continue;
				}
				if (field[i][j] == '-') {
					dfs(i, j, true);
				}
				else {
					dfs(i, j, false);
				}
				answer++;
			}
		}

		System.out.println(answer);
	}
}