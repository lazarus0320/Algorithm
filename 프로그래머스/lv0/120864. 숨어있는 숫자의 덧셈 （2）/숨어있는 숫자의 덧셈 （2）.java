class Solution {
    public int solution(String my_string) {
        int answer = 0;
        boolean check = false;
        my_string += " ";
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                tmp.append(my_string.charAt(i));
                check = true;
                if (i == my_string.length()-1) {
                    answer += Integer.parseInt(tmp.toString());
                }
            }
            else if (!Character.isDigit(my_string.charAt(i)) && check == true) {
                check = false;
                answer += Integer.parseInt(tmp.toString());
                tmp.setLength(0);
            }
        }
        return answer;
    }
}