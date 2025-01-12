import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int getDifferVal(String A, String B) {
		int result = Integer.MAX_VALUE;

		for (int i = 0; i <= B.length() - A.length(); i++) {
			int count = 0;
			for (int j = 0; j < A.length(); j++) {
				if (A.charAt(j) != B.charAt(i+j)) {
					count++;
				}
			}

			result = Math.min(result, count);
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();

		int answer = getDifferVal(A, B);

		System.out.println(answer);
	}
}