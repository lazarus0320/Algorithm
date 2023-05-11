import java.util.*;
import java.io.*;
class Solution {
    public int solution(int[] numbers) {
        // 오름차순 정렬해서 맨뒤에 두개 곱한거랑 맨앞에 두개 곱한거랑 더 큰거 리턴
        int answer = 0;
        Arrays.sort(numbers);
        answer = Math.max(numbers[numbers.length-1] * numbers[numbers.length-2], numbers[0] * numbers[1]);
        return answer;
    }
}