import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int heightMax =  H / (N+1);
		if (H % (N+1) > 0) {
			heightMax++;
		}
		int widthMax =  W / (M+1);
		if (W % (M+1) > 0) {
			widthMax++;
		}

		System.out.println(heightMax * widthMax);
	}
}