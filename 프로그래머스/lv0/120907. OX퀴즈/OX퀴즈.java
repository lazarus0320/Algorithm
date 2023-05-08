import java.util.*;
import java.io.*;
class Solution {
    public String[] solution(String[] quiz) {
        List<String> list = new ArrayList<>();
        String[] answer = {};
        for (int i = 0; i < quiz.length; i++) {
            String[] q = quiz[i].split(" ");
            int result = Integer.parseInt(q[0]);
            if (q[1].equals("+")) {
                result += Integer.parseInt(q[2]);
            }
            else result -= Integer.parseInt(q[2]);
            
            if (result == Integer.parseInt(q[4])) {
                list.add("O");
            }
            else list.add("X");
            answer = list.stream().toArray(String[]::new);
        }
        return answer;
    }
}