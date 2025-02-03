import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] upDp = new int[N + 1];
		int[] downDp = new int[N + 1];
		upDp[1] = 1;
		downDp[1] = 1;

		int[] arr = new int[N + 1];
		arr[1] = Integer.parseInt(st.nextToken());
		int ans = 1;
		for (int i = 2; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			upDp[i] = 1;
			downDp[i] = 1;

			if (arr[i] >= arr[i-1]) {
				upDp[i] = upDp[i-1] + 1;
			}
			if (arr[i] <= arr[i-1]){
				downDp[i] = downDp[i-1] + 1;
			}
			ans = Math.max(ans, Math.max(upDp[i], downDp[i]));
		}
		System.out.print(ans);
	}

}