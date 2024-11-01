import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		int minVal = Integer.MAX_VALUE;
		int maxVal = Integer.MIN_VALUE;

		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input, " ");

		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			minVal = Math.min(num, minVal);
			maxVal = Math.max(num, maxVal);
		}

		System.out.println(minVal + " " + maxVal);
	}

}