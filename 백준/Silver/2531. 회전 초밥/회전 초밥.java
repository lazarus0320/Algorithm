import java.util.*;
import java.io.*;

class Main {
	static int N, d, k, c;
	static int[] belt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		belt = new int[N];
		for(int i = 0; i < N; i++) {
			belt[i] = Integer.parseInt(br.readLine());
		}

		System.out.println(solution());
	}

	static int solution() {
		int[] eaten = new int[d + 1];
		int count = 0;
		int max = 0;

		for (int i = 0; i < k; i++) {
			if (eaten[belt[i]] == 0) {
				count++;
			}
			eaten[belt[i]]++;
		}

		if (eaten[c] == 0) {
			count++;
		}
		max = count;
		if (eaten[c] == 0) {
			count--;
		}

		for (int i = 1; i < N; i++) {
			eaten[belt[i - 1]]--;
			if (eaten[belt[i - 1]] == 0) {
				count--;
			}

			int end = (i + k - 1) % N;
			if (eaten[belt[end]] == 0) {
				count++;
			}
			eaten[belt[end]]++;

			if (eaten[c] == 0) {
				count++;
			}
			max = Math.max(max, count);
			if (eaten[c] == 0) {
				count--;
			}
		}
		return max;
	}
}