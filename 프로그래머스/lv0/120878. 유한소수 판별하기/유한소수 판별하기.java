import java.util.*;
import java.io.*;
class Solution {
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    
    public boolean primeTest(int n) {
        if (n==2) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int solution(int a, int b) {
        // 먼저 a/b를 기약분수로 나타내기
        int dominator = gcd(a, b);
        b = b / dominator;
        for (int i = 2; i <= b; i++) {
            if (b % i == 0) { // i가 b의 약수일때
                if (primeTest(i)) { // i가 소수일 때
                    if (i != 2 && i != 5) return 2;
                }
            }
        }
        return 1;
    }
}