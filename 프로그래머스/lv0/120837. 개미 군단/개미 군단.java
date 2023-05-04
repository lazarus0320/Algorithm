class Solution {
    public int solution(int hp) {
        int general = 5; int soldier = 3; int slave = 1; int answer = 0;
        if (hp >= general) {
            answer += (hp / general);
            hp %= general;
        }
        if (hp >= soldier) {
            answer += (hp / soldier);
            hp %= soldier;
        }
        if (hp >= slave) {
            answer += hp;
        }
        return answer;
    }
}