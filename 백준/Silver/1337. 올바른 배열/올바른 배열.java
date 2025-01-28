import java.util.*;
import java.io.*;

class Main {
	static int N;
	static int[] arr;
	static HashMap<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			map.put(arr[i], 0);
		}

		Arrays.sort(arr);
		System.out.print(solution());
	}

	static int solution() {
		int ans = 4;

		for (int i = 0; i < N; i++) {
			int count = 0;
			for (int j = 1; j <= 4; j++) {
				if (!map.containsKey(arr[i] + j)) {
					count++;
				}
			}
			ans = Math.min(ans, count);
		}
		return ans;
	}
}