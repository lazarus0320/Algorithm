class Solution {
    public String solution(String my_string) {
        int index = 0;
        StringBuilder sb = new StringBuilder(my_string);
        sb.reverse();
        my_string = sb.toString();
        return my_string;
    }
}