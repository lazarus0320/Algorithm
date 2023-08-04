class Solution {
    public String solution(String str, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            int cnt = 0;
            char nextChar = c;

            // Find the next valid character by incrementing according to index
            while (cnt < index) {
                nextChar = (char) (nextChar + 1);
                if (nextChar > 'z') {
                    nextChar = 'a'; // Wrap around to 'a' if we reach 'z'
                }

                if (!skip.contains(String.valueOf(nextChar))) {
                    cnt++;
                }
            }

            sb.append(nextChar);
        }
        return sb.toString();
    }
}