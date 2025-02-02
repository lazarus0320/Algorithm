import java.util.*;
import java.io.*;

class Main {

	static int[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		dp = new int[1001];

		if (N % 2 == 0) {
			System.out.print("CY");
		}
		else {
			System.out.print("SK");
		}
	}

}