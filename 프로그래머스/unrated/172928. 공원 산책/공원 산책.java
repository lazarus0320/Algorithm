class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] point = new int[2];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    point[0] = i;
                    point[1] = j;
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            char direction = routes[i].charAt(0);
            int range = Character.getNumericValue(routes[i].charAt(2));
            int tempX = point[1];
            int tempY = point[0];
            boolean check = false;
            if (direction == 'E') {
                for (int j = 0; j < range; j++) {
                    tempX++;
                    if (tempX >= park[0].length() || park[tempY].charAt(tempX) == 'X') {
                            check = true;
                            break;
                    }
                }
            }
            else if (direction == 'S') {
                for (int j = 0; j < range; j++) {
                    tempY++;
                    if (tempY >= park.length || park[tempY].charAt(tempX) == 'X') {
                        check = true;
                        break;
                    }
                }
            }
            else if (direction == 'W') {
                for (int j = 0; j < range; j++) {
                    tempX--;
                    if (tempX < 0 || park[tempY].charAt(tempX) == 'X') {
                        check = true;
                        break;
                    }
                }
            } 
            else if (direction == 'N') {
                for (int j = 0; j < range; j++) {
                    tempY--;
                    if (tempY < 0 || park[tempY].charAt(tempX) == 'X') {
                        check = true;
                        break;
                    }
                }
            }

            if (!check) {
                point[0] = tempY;
                point[1] = tempX;
            }
        }
        return point;
    }
}
