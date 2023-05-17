class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int newChicken = 0;
        int leftChicken = 0;
        
        while (chicken >= 10) {
            newChicken = chicken / 10;
            leftChicken = chicken % 10;
            chicken = newChicken + leftChicken;
            answer += newChicken;
            
        }
        return answer;
    }
}