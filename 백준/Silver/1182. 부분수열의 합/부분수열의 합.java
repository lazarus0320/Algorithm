import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

class Main {
	static int N, S, ans;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());

		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dfs(0, 0, 0);

		System.out.println(ans);
	}

	// count: 현재까지 선택한 원소의 개수
	private static void dfs(int idx, int sum, int count) {
		if (idx == N) {
			// 크기가 양수이고 합이 S인 경우만 카운트
			if (count > 0 && sum == S) ans++;
			return;
		}

		// 현재 원소를 선택하는 경우
		dfs(idx + 1, sum + arr[idx], count + 1);
		// 현재 원소를 선택하지 않는 경우
		dfs(idx + 1, sum, count);
	}
}
