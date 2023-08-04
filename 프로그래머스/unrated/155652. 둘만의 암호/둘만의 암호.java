class Solution {
    public String solution(String str, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        int[] skipArr = new int[26];
        
        for (char c : skip.toCharArray()) { //skip 단어들을 1로 설정
            skipArr[(int)c - 97]++;
        }
        
        for (char c : str.toCharArray()) {
            int cnt = 0;
            int num = (int)c;
            while (cnt < index) {
                num = (num + 1 - 'a') % 26 + 'a'; // Adjust the range to 'a' to 'z'
                if (skipArr[num - 'a'] == 1) {
                    continue;
                } else {
                    cnt++;
                }
            }
            sb.append( Character.toString((char)num) );
        }
        return sb.toString();
    }
}