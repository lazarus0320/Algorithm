class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int maxX = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            minX = Math.min(dots[i][0], minX);
            maxX = Math.max(dots[i][0], maxX);
            minY = Math.min(dots[i][1], minY);
            maxY = Math.max(dots[i][1], maxY);
        }
        answer = Math.abs(maxX - minX) * Math.abs(maxY - minY);
        return answer;
    }
}