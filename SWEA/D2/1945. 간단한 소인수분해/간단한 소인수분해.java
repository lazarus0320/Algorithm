import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Solution {
	
	private static void prime(int num) {
		
		int[] primeArr = {2, 3, 5, 7, 11};
		
		for (int i = 0; i < primeArr.length; i++) {
			
			int count = 0;
			
			while (num % primeArr[i] == 0) {
				num = num / primeArr[i];
				count++;
			}
			
			System.out.print(" " + count);
		}
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= testCase; i++) {
			
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			
			System.out.print("#" + i);	
			prime(N);
			System.out.println();
		}
	}
}
