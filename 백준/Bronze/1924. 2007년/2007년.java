import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


	public static void main(String[] args) throws IOException {

		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] weeks = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());

		int totalDay = 0;
		for (int i = 0; i < month; i++) {
			totalDay += days[i];
		}

		totalDay += day;

		System.out.println(weeks[totalDay % 7]);
	}

}