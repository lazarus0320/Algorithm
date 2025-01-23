import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

class Main {
	static int num;
	static int[] inputArr;
	static int[] operationArr;
	static int minAns = Integer.MAX_VALUE;
	static int maxAns = Integer.MIN_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/**
		 * 반복문에 입력값을 저장
		 * 순회하면서 백트래킹으로 i, i+1항을 반복문 돌려서 특정 연산자를 지정하고 계산한 값을 depth 올려서 재귀
		 */

		num = Integer.parseInt(br.readLine());
		inputArr = new int[num];
		operationArr = new int[4];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			inputArr[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			operationArr[i] = Integer.parseInt(st.nextToken());
		}

		dfs(0, inputArr[0]);
		System.out.println(maxAns);
		System.out.println(minAns);
	}

	private static void dfs(int depth, int result) {
		if (depth == num - 1) {
			// 현재 result가 최소 혹은 최대인지 확인 후 갱신
			minAns = Math.min(result, minAns);
			maxAns = Math.max(result, maxAns);
			return;
		}

		for (int j = 0; j < 4; j++) {

			if (j == 0 && operationArr[j] > 0) {
				operationArr[j]--;
				dfs(depth + 1, result + inputArr[depth + 1]);
				operationArr[j]++;
			}
			else if (j == 1 && operationArr[j] > 0) {
				operationArr[j]--;
				dfs(depth + 1, result - inputArr[depth + 1]);
				operationArr[j]++;
			}
			else if (j == 2 && operationArr[j] > 0) {
				operationArr[j]--;
				dfs(depth + 1, result * inputArr[depth + 1]);
				operationArr[j]++;
			}
			else if (j == 3 && operationArr[j] > 0) {
				operationArr[j]--;
				dfs(depth + 1, result / inputArr[depth + 1]);
				operationArr[j]++;
			}
		}

	}


}
