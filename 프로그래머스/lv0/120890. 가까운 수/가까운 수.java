// import java.util.*;
// import java.io.*;
// class Solution {
//     public int solution(int[] array, int n) {
//         Stack<Integer> stack = new Stack<>();
//         List<Integer> list = new ArrayList<>();
//         int minVal = Integer.MAX_VALUE;
//         int answer = 0;
//         for (int number : array) {
//             int temp = Math.abs(n-number); // 절댓값 구하기
//             if (temp <= minVal) { // 절댓값 작은 것(더 n에 가까운 수)으로 최신화
//                 minVal = temp;
//                 stack.push(number); // 절댓값 작은 값을 stack에 넣음
//             }
//         }
//         // [10, 16, 20] -> stack [20, 16, 10]
//         // [10, 20, 16] -> stack [16 ,20 , 10]
//         int s1 = stack.peek();
//         stack.pop();
//         if (stack.empty()) {
//             return s1;
//         }
//         else {
//             int s2 = stack.peek();
//             if (Math.abs(n-s1) == Math.abs(n-s2)) {
//                 return s1 > s2 ? s2 : s1;
//             }
//             else return s1;
//         }
        
//     }
// }
import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for(int i = 1 ; i < array.length ; i++){
            if(Math.abs(n-array[0]) > Math.abs(n-array[i])){
                array[0] = array[i];
            }
        }
        answer = array[0];
        return answer;
    }
}