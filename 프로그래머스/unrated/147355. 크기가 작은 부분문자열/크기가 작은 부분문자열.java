class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        char[] arr = t.toCharArray();
        for (int i = 0; i < t.length()-p.length() + 1; i++) {
            for (int j = 0; j < p.length(); j++) {
                sb.append(String.valueOf(arr[i+j]));
            }
            long num = Long.parseLong(sb.toString());
            if (Long.parseLong(p) >= num) {
                answer++;
            }
            sb.setLength(0);
        }
        return answer;
    }
}