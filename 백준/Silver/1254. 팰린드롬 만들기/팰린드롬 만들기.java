import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static boolean isPalindrome(String word) {
		boolean isValid = true;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
				isValid = false;
			}
		}

		return isValid;
	}

	public static void main(String[] args) throws IOException {
		String input = br.readLine();
		int answer = 0;

		for (int i = 0; i < input.length(); i++) {
			String slicedWord = input.substring(i);
			if (isPalindrome(slicedWord)) {
				answer = input.length() + input.substring(0, i).length();
				break;
			}
			else {
				answer = input.length() * 2 - 1;
			}
		}

		System.out.println(answer);
	}
}