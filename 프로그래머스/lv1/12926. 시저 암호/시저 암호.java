class Solution {
    public String solution(String s, int n) {
        StringBuffer sb = new StringBuffer();
        char[] words = s.toCharArray();
        int newIdx = 0;
        for (int i = 0; i < words.length; i++) {
            if ((int)words[i] >= 65 && (int)words[i] <= 90) {
                if ( (int)words[i] + n > 90) {
                    newIdx = ( (int)words[i] + n ) % 91 + 65;
                }
                else {
                    newIdx = ( (int)words[i] + n);
                }
                sb.append((char)newIdx);
                
            }
            else if ((int)words[i] >= 97 && (int)words[i] <= 122) {
                if ( (int)words[i] + n > 122) {
                    newIdx = ( (int)words[i] + n ) % 123 + 97;
                }
                else {
                    newIdx = ( (int)words[i] + n);
                }
                sb.append((char)newIdx);
            }
            else if (words[i] == ' ') {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}