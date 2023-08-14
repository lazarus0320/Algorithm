class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        int minY = 50, minX = 50, maxY = 0, maxX = 0;
        for (int j = 0; j < wallpaper.length; j++) {
            for (int i = 0; i < wallpaper[j].length(); i++) {
                if (wallpaper[j].charAt(i) == '#') {
                    if (minY > j) {
                        minY = j;
                    }
                    if (minX > i) {
                        minX = i;
                    }
                    if (maxY < j + 1) {
                        maxY = j + 1;
                    }
                    if (maxX < i + 1) {
                        maxX = i + 1;
                    }
                }
            }
        }
        
        answer[0] = minY;
        answer[1] = minX;
        answer[2] = maxY;
        answer[3] = maxX;
        return answer;
    }
}
