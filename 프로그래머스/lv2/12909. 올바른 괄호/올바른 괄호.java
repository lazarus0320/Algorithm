import java.util.*;
class Solution {
    boolean solution(String str) {
        boolean answer = false;
        // 스택에 아무것도 없는데 )이게 들어오거나 마지막에 스택에 뭔가 남아있으면 false
        // (이게 들어오면 스택에 넣기. )이게 들어올떄 스택에 값이 있으면 pop
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                stack.push(c);
            }
            else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                else {
                    return answer;
                }
            }
        }
        if (!stack.isEmpty()) {
            return answer;
        }
        answer = true;
        return answer;
    }
}