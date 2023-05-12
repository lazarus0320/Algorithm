class Solution {
    public int solution(String[] spell, String[] dic) {
        boolean check = false;
        int answer = 0;
        for (int i = 0; i < dic.length; i++) {
            String d = dic[i];
            if (d.length() != spell.length) continue;
            int cnt = 0;
            for (String s : spell) {
                if (d.contains(s)) cnt++;
            }
            if (cnt == d.length()) {
                check = true;
                break;
            }
        }
        return check ? 1 : 2;
    }
}