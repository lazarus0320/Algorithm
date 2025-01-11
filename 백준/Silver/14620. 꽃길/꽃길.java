import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// 현위치, 상하좌우
	static int[] dx = {0, 0, 0, -1, 1};
	static int[] dy = {0, -1, 1, 0, 0};
	static String[][] field;
	static int[][] visit;
	static int N;
	static int answer = Integer.MAX_VALUE;


	static boolean checkVisit(int x, int y) {
		for (int i = 0; i < 5; i++) {
			if (visit[x + dx[i]][y + dy[i]] == 1) {
				return true;
			}
		}
		return false;
	}

	static void clearVisit(int x, int y) {
		for (int i = 0; i < 5; i++) {
			visit[x + dx[i]][y + dy[i]] = 0;
		}
	}

	static int sumCost(int x, int y) {
		int sumVal = 0;
		for (int i = 0; i < 5; i++) {
			sumVal += Integer.parseInt(field[x + dx[i]][y + dy[i]]);
			visit[x + dx[i]][y + dy[i]] = 1;
		}
		return sumVal;
	}

	static void dfs(int depth, int sumVal) {
		if(sumVal >= answer) return;

		if (depth == 3) {
			answer = Math.min(sumVal, answer);
		}
		else {
			for (int i = 1; i < N - 1; i++) {
				for (int j = 1; j < N - 1; j++) {
					if (!checkVisit(i, j)) {
						int cost = sumCost(i, j);
						dfs(depth + 1, sumVal + cost);
						clearVisit(i, j);
					}
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		field = new String[N][N];

		// field 입력 받기
		for (int i = 0; i < N; i++) {
			String[] inputLineArr = br.readLine().split(" ");
			field[i] = inputLineArr;
		}

		visit = new int[N][N];

		// 가능한 영역 내 범위에서 심을 수 있는 모든 지점의 5평 값 합 리스트로 저장

		dfs(0, 0);

		System.out.println(answer);
	}
}