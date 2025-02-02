import java.util.*;
import java.io.*;

class Main {

	static int[] aDp;
	static int[] bDp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		aDp = new int[46];
		bDp = new int[46];

		dpMaker(N);
	}

	static void dpMaker(int N) {
		aDp[0] = 1;
		bDp[0] = 0;
		aDp[1] = 0;
		bDp[1] = 1;

		for (int i = 2 ; i <= N; i++) {
			aDp[i] = aDp[i-1] + aDp[i-2];
			bDp[i] = bDp[i-1] + bDp[i-2];
		}

		System.out.print(aDp[N] + " " + bDp[N]);
	}

}