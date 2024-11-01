import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


	public static void main(String[] args) throws IOException {
		/**
		 * 현제 인덱스 + 9보다 단어 길이가 더 길다?
		 * 현재 인덱스 ~ 끝 인덱스까지 substring 하며 출력
		 * 현재 인덱스 = 끝 인덱스, 끝 인덱스 += 9
		 *
		 * 현제 인덱스 + 9보다 단어 길이가 더 짧다?
		 * 현재 인덱스 ~ 맨 마지막까지 substring 하며 출력
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String word = br.readLine();
		int startIndex = 0;
		while (startIndex + 10 < word.length()) {
			System.out.println(word.substring(startIndex, startIndex + 10));
			startIndex += 10;
		}

		System.out.println(word.substring(startIndex));
	}

}