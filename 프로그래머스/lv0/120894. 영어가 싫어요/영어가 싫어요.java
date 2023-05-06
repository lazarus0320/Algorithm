import java.util.*;
import java.io.*;
class Solution {
    public long solution(String numbers) {
//         Map<String, Integer> map = new HashMap<>();
//         map.put("zero", 0);
//         map.put("one", 1);
//         map.put("two", 2);
//         map.put("three", 3);
//         map.put("four", 4);
//         map.put("five", 5);
//         map.put("six", 6);
//         map.put("seven", 7);
//         map.put("eight", 8);
//         map.put("nine", 9);
//         StringBuilder keyName = new StringBuilder();
//         StringBuilder answerSb = new StringBuilder();
        
//         for (int i = 0; i < numbers.length(); i++){
//             char c = numbers.charAt(i);
//             keyName.append(String.valueOf(c));
//             if (map.containsKey(keyName.toString())) {
//                 answerSb.append(map.get(keyName.toString()));
//                 keyName.setLength(0);
//             }
//         }
//         long answer = Long.parseLong(answerSb.toString());
        
//         return answer;
        String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < numbers_arr.length; i++) {
            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
        }
        long answer = Long.parseLong(numbers);
        return answer;
    }
}