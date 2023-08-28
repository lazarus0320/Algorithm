import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        
        // Rotate the string and check for valid parentheses
        for (int rotation = 0; rotation < s.length(); rotation++) {
            // Reset the stack for each rotation
            stack.clear();
            
            // Iterate through the characters of the rotated string
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt((i + rotation) % s.length()); // Rotate the index
                
                if (c == '[' || c == '{' || c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        break; // Invalid parentheses
                    }
                    char top = stack.peek();
                    if ((c == ']' && top == '[') || (c == '}' && top == '{') || (c == ')' && top == '(')) {
                        stack.pop();
                    } else {
                        break; // Mismatched parentheses
                    }
                }
                
                if (i == s.length() - 1 && stack.isEmpty()) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}