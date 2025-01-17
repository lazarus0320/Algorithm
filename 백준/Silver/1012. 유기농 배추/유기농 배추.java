import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N = 0;
	static int M = 0;
	static int[] dRow = {0, 0, -1, 1};
	static int[] dCol = {-1, 1, 0, 0};
	static int[][] field;
	static boolean[][] visit;

	static int dfs(int col, int row) {
		visit[col][row] = true;

		for (int i = 0; i < dCol.length; i++) {
			int newCol = col + dCol[i];
			int newRow = row + dRow[i];
			if (newCol >= 0 && newCol < N && newRow >= 0 && newRow < M) {
				if (!visit[newCol][newRow] && field[newCol][newRow] == 1) {
					dfs(newCol, newRow);
				}
			}
		}

		return 1;
	}

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());

		for (int cycle = 0; cycle < T; cycle++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			visit = new boolean[N][M];
			field = new int[N][M];
			int answer = 0;

			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				int X = Integer.parseInt(st.nextToken());
				int Y = Integer.parseInt(st.nextToken());
				field[Y][X] = 1;
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (!visit[i][j] && field[i][j] == 1) {
						answer += dfs(i, j);
					}
				}
			}

			System.out.println(answer);
		}
	}
}