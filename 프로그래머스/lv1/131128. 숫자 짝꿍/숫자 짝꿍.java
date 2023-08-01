import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] xArr = new int[10];
        int[] yArr = new int[10];

        for (int i = 0; i < X.length(); i++) {
            xArr[Character.getNumericValue(X.charAt(i))]++;
        }
        for (int i = 0; i < Y.length(); i++) {
            yArr[Character.getNumericValue(Y.charAt(i))]++;
        }
        
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < Math.min(xArr[i], yArr[i]); j++) {
                sb.append(String.valueOf(i));
            }
        }
        if(sb.toString().equals("")) return "-1";
        else if (sb.toString().charAt(0) == '0') return "0";
        else return sb.toString();
    }
}