import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Solution {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	


	public static void main(String[] args) throws IOException {
		/**
		 * 내가 손이 비었을때, 오늘 이후로 남아있는 날 중 제일 비싼 매매가가 있는 날이 있으면 산다
		가장 비싼날 전량 매도
		 */
	
		
		/**
		 * N을 받는다.
		 * 1~N까지 아래 로직을 반복 적용한다.
		 * 
		 * Integer -> String
		 * String.replace를 통해 3, 6, 9를 '-'로 변경한다.
		 */
		int N = Integer.parseInt(br.readLine());
		for (int j = 1; j <= N; j++) {
			String intToStr = String.valueOf(j);
			intToStr = intToStr.replace('3', '-');
			intToStr = intToStr.replace('6', '-');
			intToStr = intToStr.replace('9', '-');
			
			
			// -xxx 형태면 -로 변경
			// -를 ""로 초기화했을 때 길이가 1이상?
			char[] strToCharArr = intToStr.toCharArray();
			StringBuilder sb = new StringBuilder();
			for (char c: strToCharArr) {
				if (c == '-') {
					sb.append('-');
				}
			}
			
			if (sb.toString().length() > 0) {
				System.out.print(sb.toString() + " ");
			}
			else {
				System.out.print(intToStr + " ");
			}
		}
	}
}
