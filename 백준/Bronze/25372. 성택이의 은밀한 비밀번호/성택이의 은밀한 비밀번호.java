import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		int cycle = Integer.parseInt(br.readLine());

		for (int i = 0; i < cycle; i++) {
			String inputPw = br.readLine();
			if (inputPw.length() >= 6 && inputPw.length() <= 9) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}

	}
}