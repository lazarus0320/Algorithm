import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		char[][] field = new char[N][M];

		for (int i = 0; i < N; i++) {
			char[] inputLine = br.readLine().toCharArray();
			field[i] = inputLine;
		}

		int max = 1;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int k = 1;
				while (i + k < N && j + k < M) {
					if (field[i][j] == field[i + k][j] && field[i + k][j] == field[i][j + k] && field[i][j + k] == field[i + k][j + k]) {
						max = Math.max((k+1) * (k+1), max);
					}
					k++;
				}
			}
		}

		System.out.print(max);
	}
}