import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        /**
        people을 내림차순 [80, 70, 50, 50]
        오름차순 [50, 50, 70, 80]
        [10, 20, 20, 40, 60, 80]
        */
        Arrays.sort(people);
        int min = 0;
        for (int i = people.length - 1; i >= min; i--) {
            if (people[i] + people[min] <= limit) {
                answer++;
                min++;
            }
            else {
                answer++;
            }
        }
        return answer;
    }
}