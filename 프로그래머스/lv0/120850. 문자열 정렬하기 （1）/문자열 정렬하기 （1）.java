import java.util.stream.Stream;
import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String[] arr = my_string.replaceAll("[a-z]", "").split("");
        int[] newArr = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(newArr);
        
        return newArr;
    }
    
    
}