import java.util.*;
import java.io.*;
class Solution {
    public long solution(long n) {
        String[] strN = String.valueOf(n).split("");
        int[] arr = new int[strN.length];
        for (int i = 0; i < strN.length; i++) {
            arr[i] = Integer.parseInt(strN[i]);
        }
        Arrays.sort(arr);
        long result = 0;
        for (int i = strN.length - 1; i >= 0; i--) {
            result = result * 10 + arr[i];
        }

        return result;
    }
}