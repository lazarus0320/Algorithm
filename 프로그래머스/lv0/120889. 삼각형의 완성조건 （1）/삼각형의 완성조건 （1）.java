import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int solution(int[] sides) {
        Integer[] boxArr = Arrays.stream(sides).boxed().toArray(Integer[]::new);
        Arrays.sort(boxArr, Comparator.reverseOrder());
        if (boxArr[0] < boxArr[1] + boxArr[2]) return 1;
        else return 2;
    }
}