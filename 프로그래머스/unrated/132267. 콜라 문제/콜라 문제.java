class Solution {
    public int solution(int a, int b, int n) {
        
    /*
    3개의 경우
    20 / 3 = 6, 20 % 3 = 2
    6 + 2 = 8(가지고 있는 콜라병 수)
    
    8 / 3 = 2, 8 % 3 = 2
    2 + 2 = 4
    
    4 / 3 = 1, 4 % 3 = 1
    1 + 1 = 2
    
    3 < 2 !
    
    a = 4 
    
    
    */
        int answer = 0;
        
        while (n >= a) {
            int takenCola = (n / a) * b;
            int myCola = n % a;
            answer += takenCola;
            n = takenCola + myCola;
        }
        return answer;
    }
}