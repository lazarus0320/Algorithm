import java.io.*;
import java.util.*;
class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        int cycle = (int)(n / 2);
        for (int i = 0; i < cycle; i++) {
            sb.append("수박");
        }
        if (n % 2 == 1) sb.append("수");
        answer = sb.toString();
        return answer;
    }
}