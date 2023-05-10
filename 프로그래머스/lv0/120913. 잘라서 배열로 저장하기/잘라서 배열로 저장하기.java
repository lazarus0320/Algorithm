import java.util.*;
import java.io.*;
class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_str.length(); i+=n) {
            list.add(my_str.substring(i, Math.min(i+n, my_str.length())));
            if ( i+n >= my_str.length()) {
                break;
            }
        }
        answer = list.stream().toArray(String[]::new);
        return answer;
    }
}