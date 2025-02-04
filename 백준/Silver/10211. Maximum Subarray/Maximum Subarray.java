import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			int arr[] = new int[N+1];

			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[0] = Integer.parseInt(st.nextToken());
			int ans = arr[0];
			for (int j = 1; j < N; j++) {
				int num = Integer.parseInt(st.nextToken());
				int temp = arr[j-1] + num;
				arr[j] = Math.max(num, temp);
				ans = Math.max(ans, arr[j]);
			}

			System.out.println(ans);
		}
	}

}