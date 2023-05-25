class Solution {
    String[] addZero(String bin, int n) {
        String zero = "";
        for (int i = 0; i < n - bin.length(); i++) {
            zero += "0";
        }
        bin = zero + bin;
        return bin.split("");
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String sharp = "";
        for (int i = 0; i < n; i++) {
            String bin1 = Integer.toBinaryString(arr1[i]);
            String bin2 = Integer.toBinaryString(arr2[i]);
            
            String[] a1 = addZero(bin1, n);
            String[] a2 = addZero(bin2, n);
            sharp = "";
            for (int j = 0; j < n; j++) {
                if (a1[j].equals("1") || a2[j].equals("1")) {
                    sharp += "#";
                }
                else sharp += " ";
            }
            answer[i] = sharp;
        }
        return answer;
    }
}