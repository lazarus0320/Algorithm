import java.util.*;
import java.io.*;
class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        return arr[(int)(n / 2.0)];
    }
}