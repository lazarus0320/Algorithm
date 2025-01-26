import java.util.*;
import java.io.*;

class Main {
	static int N, M;
	static int[] ansArr, arr1, arr2;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr1 = new int[N];
		arr2 = new int[M];
		ansArr = new int[N+M];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}

		solution();

	}

	static void solution() {
		int idx1 = 0, idx2 = 0;
		StringBuilder sb = new StringBuilder();

		// 각 배열의 idx를 0으로 초기화
		// arr[idx1]과 arr[idx2] 비교, 더 작은 값을 배열에 추가 후, 해당 idx를 증가
		while (idx1 < N && idx2 < M) {
			if (arr1[idx1] >= arr2[idx2]) {
				sb.append(arr2[idx2]).append(" ");
				idx2++;
			}
			else {
				sb.append(arr1[idx1]).append(" ");
				idx1++;
			}
		}

		while (idx1 < N) {
			sb.append(arr1[idx1]).append(" ");
			idx1++;
		}
		while (idx2 < M) {
			sb.append(arr2[idx2]).append(" ");
			idx2++;
		}
		System.out.print(sb);
	}
}