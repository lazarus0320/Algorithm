import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	static int[][] field;
	static boolean[] visit;
	static int N;
	static int M;
	static int ans;

	static void dfs(int start) {

		visit[start] = true;

		for (int i = 1; i <= N; i++) {
			if (!visit[i] && field[start][i] == 1) {
				ans++;
				dfs(i);
			}
		}
	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());

		field = new int[N+1][N+1];
		visit = new boolean[N+1];

		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			field[x][y]++;
			field[y][x]++;
		}
		dfs(1);
		System.out.print(ans);
	}
}