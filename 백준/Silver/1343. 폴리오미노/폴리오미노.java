import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";
        String str = "";
        str = br.readLine();
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            char word = str.charAt(i);
            cnt++;
            if (cnt == 4) {
                answer += "AAAA";
                cnt = 0;
            }

            if (word == '.') {
                cnt--;
                if (cnt % 2 != 0) {
                    answer = "-1";
                    cnt = 0;
                    break;
                }
                if (cnt > 0) {
                    answer += "BB";
                    cnt = 0;
                }
                answer += ".";
            }
        }
        if (cnt % 2 != 0) {
            answer = "-1";
        }

        else if (cnt > 0) {
            answer += "BB";
        }

        System.out.println(answer);
    }
}
