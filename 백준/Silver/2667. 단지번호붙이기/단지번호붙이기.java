import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N = 0;
	static int M = 0;
	static int[] dRow = {0, 0, -1, 1};
	static int[] dCol = {-1, 1, 0, 0};
	static int[][] field;
	static boolean[][] visit;

	static int dfs(int col, int row, int sum) {
		visit[col][row] = true;

		for (int i = 0; i < 4; i++) {
			int newCol = col + dCol[i];
			int newRow = row + dRow[i];

			if (newCol >= 0 && newCol < N && newRow >= 0 && newRow < N) {
				if (!visit[newCol][newRow] && field[newCol][newRow] == 1) {
					sum = dfs(newCol, newRow, sum + 1);
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		List<Integer> danjiList = new ArrayList<>();
		field = new int[N][N];
		visit = new boolean[N][N];

		for (int i = 0; i < N; i++) {
			String inputLine = br.readLine();
			for (int j = 0; j < N; j++) {
				field[i][j] = inputLine.charAt(j) - '0';
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visit[i][j] && field[i][j] == 1) {
					danjiList.add(dfs(i, j, 1));
				}
			}
		}

		Collections.sort(danjiList);
		System.out.println(danjiList.size());
		for (int num : danjiList) {
			System.out.println(num);
		}
	}
}