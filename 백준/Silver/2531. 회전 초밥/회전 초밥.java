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

		// 초기 윈도우
		for(int i = 0; i < k; i++) {
			if(eaten[belt[i]]++ == 0) count++;
		}

		// 쿠폰 초밥 확인
		if(eaten[c] == 0) count++;
		max = count;
		if(eaten[c] == 0) count--;

		// 슬라이딩
		for(int i = 1; i < N; i++) {
			// 이전 초밥 제거
			if(--eaten[belt[i-1]] == 0) count--;

			// 새 초밥 추가
			int end = (i + k - 1) % N;
			if(eaten[belt[end]]++ == 0) count++;

			// 쿠폰 확인
			if(eaten[c] == 0) count++;
			max = Math.max(max, count);
			if(eaten[c] == 0) count--;
		}

		return max;
	}
}