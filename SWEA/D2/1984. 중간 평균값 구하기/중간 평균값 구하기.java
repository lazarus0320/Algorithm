import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Solution {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	public static void main(String[] args) throws IOException {
		
		int T = Integer.parseInt(br.readLine());
		
		
		for (int test = 1; test <= T; test++) {
			
			int[] numArr = new int[10];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for (int i = 0; i < 10; i++) {
				numArr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(numArr);
			int sum = 0;
			
			for (int i = 1; i < numArr.length - 1; i++) {
				sum += numArr[i];
			}
			
			System.out.println("#" + test + " " + (int)Math.round((float)sum / 8));
		}
		
	}
}
