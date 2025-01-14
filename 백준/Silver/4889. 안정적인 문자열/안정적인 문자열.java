import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		int cycle = 1;

		while (true) {
			int answer = 0;
			Stack<Character> stack = new Stack<>();
			String word = br.readLine();
			if (word.contains("-")) {
				break;
			}
			word += " ";

			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == ' ') {
					break;
				}
				char c = word.charAt(i);
				if (c == '}') {
					if (stack.empty() || stack.peek() == '}') {
						stack.push('}');
					}
					else if (stack.peek() == '{') {
						stack.pop();
					}
				}
				else if (c == '{') {
					stack.push('{');

				}
			}

			while (!stack.isEmpty()) {
				int first = stack.pop();
				int second = stack.pop();

				if (first == second) {
					answer++;
				}
				else {
					answer += 2;
				}
			}

			System.out.println(cycle + ". " + answer);
			cycle++;
			/**
			 * 문자열 순으로 하나씩 확인
			 * 스택 비었는데 닫는 괄호 먼저 나오면 여는 괄호로 변경 후 스택 넣기, cnt
			 * 지금 문자가 닫는 괄호인데 스택에 여는 괄호? 스택에서 하나 뽑기
			 * 지금 문자가 여는 괄호인데 스택에 여는 괄호? 스택에서 하나 뽑기, cnt
			 */
		}
	}
}
// {{{}{{
// {{}}{{}}
// 	{{{}}}{{
/**
 * }{ -> }를 {, } -> { : 2
 * {{{} ->
 * {{{
 */