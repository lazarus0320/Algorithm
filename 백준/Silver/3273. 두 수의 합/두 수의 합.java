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
		int N = Integer.parseInt(br.readLine());

		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int X = Integer.parseInt(br.readLine());

		Arrays.sort(arr);

		System.out.print(twoPointer(N, X));
	}

	static int twoPointer(int N, int X) {
		int start = 0, end = N-1, ans = 0;
		while (start < end) {
			int sum = arr[start] + arr[end];

			if (sum == X) {
				ans++;
				start++;
				end--;
			}
			else if (sum < X) {
				start++;
			}
			else {
				end--;
			}
		}
		return ans;
	}
}
