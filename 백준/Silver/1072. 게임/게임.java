import java.util.*;
import java.io.*;

class Main {
	static int X, Y;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		X = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());

		System.out.print(solution());
	}

	static int solution() {
		// 현재 승률 계산
		int currentRate = (int)((long)Y * 100 / X);

		if (Y == X) return -1;

		int left = 1, right = X;
		int ans = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			// 오버플로우 방지를 위해 long 사용
			int newRate = (int)((long)(Y + mid) * 100 / (X + mid));

			if (newRate > currentRate) {
				ans = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return ans;
	}
}