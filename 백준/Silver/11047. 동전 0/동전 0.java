import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] coinArr = new int[N];

		for (int i = 0; i < N; i++) {
			coinArr[i] = Integer.parseInt(br.readLine());
		}

		int ans = 0;

		for (int i = coinArr.length - 1; i >= 0; i--) {
			if (coinArr[i] <= K) {
				ans += K / coinArr[i];
				K = K % coinArr[i];
			}

			if (K == 0) {
				break;
			}
		}

		System.out.print(ans);
	}
}