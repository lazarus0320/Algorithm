import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		double[] arr = new double[N+1];
		arr[1] = Double.parseDouble(br.readLine());
		double ans = 0;
		for (int i = 2; i <= N; i++) {
			arr[i] = Double.parseDouble(br.readLine());
			arr[i] = Math.max(arr[i], arr[i-1] * arr[i]);
			ans = Math.max(ans, arr[i]);
		}
		System.out.print(String.format("%.3f", ans));
	}

}