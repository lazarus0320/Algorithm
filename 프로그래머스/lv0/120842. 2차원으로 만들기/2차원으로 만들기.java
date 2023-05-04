import java.util.*;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int rows = num_list.length / n;
        int[][] answer = new int[rows][n];
        final int[] index = {0};
        answer = Arrays.stream(answer)
            .map(row -> Arrays.stream(row)
                .map(col -> num_list[index[0]++])
                .toArray())
            .toArray(int[][]::new);
        return answer;
    }
}