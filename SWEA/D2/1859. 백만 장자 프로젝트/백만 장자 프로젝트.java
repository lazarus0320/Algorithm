import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Solution {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private static long calculate(int[] prices) {

		long profit = 0;
		int max = prices[prices.length - 1];
		
		for (int i = prices.length - 2; i >= 0; i--) {
			
			if (max < prices[i]) {
				max = prices[i];
			}
			else {
				profit += max - prices[i];
			}
		}
		
		return profit;
	}

	public static void main(String[] args) throws IOException {
		/**
		 * 내가 손이 비었을때, 오늘 이후로 남아있는 날 중 제일 비싼 매매가가 있는 날이 있으면 산다
		가장 비싼날 전량 매도
		 */
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {

			int N = Integer.parseInt(br.readLine());
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input, " ");
			
			int[] arr = new int[N];
			
			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			
			System.out.println("#" + i + " " + calculate(arr));
		}
	}
}
