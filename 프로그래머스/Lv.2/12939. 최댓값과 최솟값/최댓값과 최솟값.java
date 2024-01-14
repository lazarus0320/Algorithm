class Solution {
    public String solution(String s) {
        // String answer = "";
        // String[] sArr = s.split(" ");
        // int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        // for (String sNum : sArr) {
        //     int num = Integer.parseInt(sNum);
        //     if (num < min) {
        //         min = num;
        //     }
        //     if (num > max) {
        //         max = num;
        //     }
        // }
        // answer = min + " " + max;
        String answer = "";
        String[] sArr = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (String sNum : sArr) {
            int tmp = Integer.parseInt(sNum);
            if (min > tmp) {
                min = tmp;
            }
            if (max < tmp) {
                max = tmp;
            }
        }
        
        answer = min + " " + max;
        return answer;
    }
}