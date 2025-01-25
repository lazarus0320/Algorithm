import java.util.*;
import java.io.*;

class Main {
	static int N;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		System.out.println(solution());

	}

	static int solution() {
		int start = 1, end = 1;
		int sum = 1;
		int count = 1;  // N 자체를 포함

		while(start < N) {
			if (sum == N) {
				count++;
				sum -= start;
				start++;
			}
			else if (sum > N) {
				sum -= start;
				start++;
			}

			else {
				end++;
				sum += end;
			}
		}
		return count;
	}
}