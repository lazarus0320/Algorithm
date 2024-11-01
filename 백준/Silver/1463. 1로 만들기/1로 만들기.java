import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {

		/**
		 * 1 => 1
		 * 2 -> -1(1) ->1 => 1
		 * 3 -> /3(1) -> 1 => 1
		 * 4 -> -1(1) -> 3 -> /3(2) => 2
		 * 5 -> -1(1) -> 4 -> ( + val[4]) = 1+2 => 3
		 * 5 -> -1(1) -> 4 -> -1(2) -> 3 -> /3(3) -> 1 => 3
		 *
		 * 6 -> /3(1) -> 2 -> ( + val[2]) 1 + 1 => 2
		 *
		 * 3으로 나누어 떨어지는경우? -> 그 수의 /3값 + 1
		 * 2로 나눠 떨어지는 경우? -> 그 수의 /2 값 + 1
		 * 안되면 이전값 + 1
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num + 1];
		arr[1] = 0;
		
		for (int i = 2; i <= num; i++) {
			arr[i] = arr[i - 1] + 1;

			if (i % 2 == 0) {
				arr[i] = Math.min(arr[i], arr[i / 2] + 1);
			}

			if (i % 3 == 0) {
				arr[i] = Math.min(arr[i], arr[i / 3] + 1);
			}
		}

		System.out.println(arr[num]);
	}

}