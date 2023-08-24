import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        // 6 / 2 = 3
        // 못 나눈다? -1 -> 2   (1)
        // 2/ 2 = 1
        //     못나눈다? -1 -> 0 (2)
        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            }
            else {
                n -= 1;
                ans++;
            }
        }
        return ans;
    }
}