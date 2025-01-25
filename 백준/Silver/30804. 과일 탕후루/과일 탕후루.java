import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
	static int[] arr;
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.print(solution());
	}

	static int solution() {
		int max = 0;
		int left = 0;
		int types = 0;
		int[] count = new int[10];

		for (int right = 0; right < N; right++) {
			if (count[arr[right]]++ == 0) types++;

			while (types > 2) {
				if (--count[arr[left]] == 0) types--;
				left++;
			}

			max = Math.max(max, right - left + 1);
		}
		return max;
	}
}
