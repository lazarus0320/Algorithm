import java.util.*;
import java.io.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int num = numbers[i] + numbers[j];
                if (list.contains(num)) {
                    continue;
                }
                list.add(numbers[i] + numbers[j]);
            }
        }
        Collections.sort(list);
        answer = list.stream().mapToInt(n->n).toArray();
        return answer;
    }
}