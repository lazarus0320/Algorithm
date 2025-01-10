import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static List<Integer> speakList = new ArrayList<>();
	public static void main(String[] args) throws IOException {

		int A = Integer.parseInt(br.readLine());
		int T = Integer.parseInt(br.readLine());
		int speak = Integer.parseInt(br.readLine());

		int cycle = 1;
		int num = 0;
		int result = -1;
		boolean isOver = false;

		while (true) {
			speakList.add(0);
			speakList.add(1);
			speakList.add(0);
			speakList.add(1);

			for (int i = 1; i <= cycle + 1; i++) {
				speakList.add(0);
			}

			for (int i = 1; i <= cycle + 1; i++) {
				speakList.add(1);
			}

			for (int i = 0; i < speakList.size(); i++) {
				result++;
				// System.out.println("현재 result = " + result);

				if (speakList.get(i) == speak) {
					num++;
					if (T == num) {
						System.out.println(result % A);
						isOver = true;
						break;
					}
				}
			}

			if (isOver) {
				break;
			}
			speakList.clear();
			cycle++;
		}

	}
}