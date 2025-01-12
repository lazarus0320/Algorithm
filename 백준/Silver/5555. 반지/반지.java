import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String input = br.readLine();
		int N = Integer.parseInt(br.readLine());
		String[] inputList = new String[N];
		int answer = 0;

		for (int i = 0; i < N; i++) {
			inputList[i] = br.readLine();
		}

		for (int i = 0; i < N; i++) {
			String word = inputList[i];
			word = word + word;
			if (word.contains(input)) {
				answer++;
			}
		}

		System.out.println(answer);
	}
}