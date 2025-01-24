import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.print(twoPointer(N, M));
	}

	static int twoPointer(int N, int goal) {
		int ans = 0, start = 0, end = 0, sum = 0;

		while (true) {
			if (sum >= goal) {
				sum -= arr[start++];
			} else if (end == N) {
				break;
			} else {
				sum += arr[end++];
			}

			if (sum == goal) {
				ans++;
			}
		}

		return ans;
	}
}
