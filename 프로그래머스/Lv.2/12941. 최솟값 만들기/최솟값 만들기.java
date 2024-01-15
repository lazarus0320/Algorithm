import java.util.*;
class Solution {
    public int solution(int []A, int []B) {
        // int answer = 0;
        // Arrays.sort(A);
        // Integer[] newB = new Integer[B.length];
        // for (int i = 0; i < B.length; i++) {
        //     newB[i] = B[i];
        // }
        // Arrays.sort(newB, Comparator.reverseOrder());
        // for (int i = 0; i < A.length; i++) {
        //     answer += (A[i] * newB[i]);
        // }
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i = 0; i < A.length; i++) {
            answer += (A[i] * B[B.length - 1 - i]);
        }
        return answer;
    }
}