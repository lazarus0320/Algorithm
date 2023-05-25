import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String words = br.readLine(); // 입력받을 괄호 값
        Stack<Character> stack = new Stack<>();

        int answer = 0, tmp = 1;
        boolean isError = false;

        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == '(') {
                stack.push('(');
                tmp *= 2;
            }
            else if (words.charAt(i) == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    isError = true;
                    break;
                }
                else {
                    if (words.charAt(i - 1) == '(') answer += tmp;
                    stack.pop();
                    tmp /= 2;
                }
            }
            else if ( words.charAt(i) == '[') {
                stack.push('[');
                tmp *= 3;
            }
            else if (words.charAt(i) == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    isError = true;
                    break;
                }
                else {
                    if ( words.charAt(i - 1) == '[') answer += tmp;
                    stack.pop();
                    tmp /= 3;
                }
            }
        }

        if (isError || !stack.isEmpty()) {
            bw.write("0");
        }
        else bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
    }
}