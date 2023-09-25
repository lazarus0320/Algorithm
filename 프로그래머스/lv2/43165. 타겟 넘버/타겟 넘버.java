class Solution {
    static int count = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);
        return count;
    }
    
    public void dfs(int depth, int currentSum, int[] numbers, int target) {
        if (depth == numbers.length) {
            if (currentSum == target) {
                count++;
            }
            return;
        }
        
        // Add the current number and subtract it to explore both possibilities
        dfs(depth + 1, currentSum + numbers[depth], numbers, target);
        dfs(depth + 1, currentSum - numbers[depth], numbers, target);
    }
}
