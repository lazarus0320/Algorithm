import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		String[] inputList = new String[N];

		for (int i = 0; i < N; i++) {
			inputList[i] = br.readLine();
		}

		for (int i = 0; i < N; i++) {

			if (input.length() - 1 > inputList[i].length()) {
				System.out.println("NE");
				continue;
			}
			int wildIndex = input.indexOf('*');
			if (wildIndex == -1) {
				wildIndex = input.indexOf(' ');
			}
			// System.out.println("wildIndex: " + wildIndex);
			String frontInputWord = input.substring(0, wildIndex);
			String lastInputWord = input.substring(wildIndex+1);
			// System.out.println("frontInputWord: " + frontInputWord);
			// System.out.println("lastInputWord: " + lastInputWord);

			String frontWord = inputList[i].substring(0, frontInputWord.length());
			String lastWord = inputList[i].substring(inputList[i].length() - lastInputWord.length());
			// System.out.println("frontWord: " + frontWord);
			// System.out.println("lastWord: " + lastWord);


			if (frontWord.equals(frontInputWord) && lastWord.equals(lastInputWord)) {
				System.out.println("DA");
			}
			else {
				System.out.println("NE");
			}
		}
	}
}