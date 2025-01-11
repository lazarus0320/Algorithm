import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(br.readLine());
		int[] inputArr = new int[N];
		int[] strikeArr = new int[N];
		int[] ballArr = new int[N];
		int answer = 0;

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			inputArr[i] = Integer.parseInt(st.nextToken());
			strikeArr[i] = Integer.parseInt(st.nextToken());
			ballArr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 123; i <= 987; i++) {
			// inputArr이 i에 대한 strike, ball 계산

			int firstI = i / 100;
			int secondI = (i / 10) % 10;
			int thirdI = i % 10;

			// 0이 포함되면 스킵
			if (firstI == 0 || secondI == 0 || thirdI == 0) {
				continue;
			}
			// 중복 자리수 있으면 스킵
			if (firstI == secondI || firstI == thirdI || secondI == thirdI) {
				continue;
			}

			boolean isValid = true;

			for (int j = 0; j < N; j++) {
				int input = inputArr[j];
				int strike = strikeArr[j];
				int ball = ballArr[j];
				int tempStrike = 0;
				int tempBall = 0;



				int firstInput = input / 100;
				int secondInput = (input / 10) % 10;
				int thirdInput = input % 10;



				// 첫째자리 수 검산
				if (firstInput == firstI) {
					tempStrike++;
				}
				else if (firstInput == secondI || firstInput == thirdI) {
					tempBall++;
				}

				// 둘째자리 수 검산
				if (secondInput == secondI) {
					tempStrike++;
				}
				else if (secondInput == firstI || secondInput == thirdI) {
					tempBall++;
				}

				// 셋째자리 수 검산
				if (thirdInput == thirdI) {
					tempStrike++;
				}
				else if (thirdInput == firstI || thirdInput == secondI) {
					tempBall++;
				}

				// 주어진 strike, ball과 일치 여부 검산
				if (tempStrike != strike || tempBall != ball) {
					isValid = false;
					break;
				}

			}

			if (isValid) {
				answer++;
			}
		}

		System.out.println(answer);
	}
}