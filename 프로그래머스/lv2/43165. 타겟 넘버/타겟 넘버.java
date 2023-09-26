class Solution {
    
    public int solution(int[] numbers, int target) {
        return backTrack(0, 0, numbers, target);
    }
    
    public int backTrack(int depth, int sumValue, int[] numbers, int target) {
        if (depth == numbers.length) {
            if (sumValue == target) {
                return 1;
            }
            return 0;
        }
        
        int addCase = backTrack(depth + 1, sumValue + numbers[depth], numbers, target);
        int minusCase = backTrack(depth + 1, sumValue - numbers[depth], numbers, target);
        return addCase + minusCase;
    }
}

