import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int num = Integer.parseInt(st.nextToken());

		for (int i = 0; i < num; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st2.nextToken());
			int second = Integer.parseInt(st2.nextToken());

			System.out.println("Case #" + (i+1) + ": " + (first+second));
		}
	}

}