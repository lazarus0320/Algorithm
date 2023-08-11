class Solution {
    public String solution(String new_id) {
        String answer = "";
        answer = new_id
            .toLowerCase(); // 1단계
            // .replaceAll("[~!@#$%^&*()=+[{]}:?,<>/]", ""); //2단계
        
        StringBuilder step2 = new StringBuilder();
        for (char c : answer.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                step2.append(c);
            }
        }
        answer = step2.toString();
        while (answer.contains("..")) { // 3단계
            answer = answer.replace("..", ".");
        }
        
        // 4단계
        if (answer.charAt(0) == '.') { 
            answer = answer.substring(1, answer.length());
        }
        
        if (answer.length() > 0 && answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
        }
        
        // 5단계
        if (answer.length() == 0) {
            answer = "a";
        }
        
        // 6단계
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
            if (answer.charAt(answer.length() - 1) == '.') {
                answer = answer.substring(0, 14);
            }
        }
        
        // 7단계
        StringBuilder sb = new StringBuilder(answer);
        while(sb.length() < 3) {
            sb.append(answer.charAt(answer.length() - 1));
        }
        answer = sb.toString();
        return answer;
    }
}