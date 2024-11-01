import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String numStr = br.readLine();
		char[] numCharArr = numStr.toCharArray();
		int answer = 0;

		for (int i = 0; i < numCharArr.length; i++) {
			answer += Character.getNumericValue(numCharArr[i]);
		}

		System.out.println(answer);
	}

}