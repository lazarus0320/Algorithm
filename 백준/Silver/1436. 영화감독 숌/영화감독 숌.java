import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int apoNum = 666;
        int cnt = 1;
        int num = Integer.parseInt(br.readLine());

        while (cnt != num) {
            apoNum++;
            if (String.valueOf(apoNum).contains("666")) {
                cnt++;
            }
        }
        System.out.println(apoNum);
        /**
            1: 666
            2: 1666
            7: 6660
         ...
         666부터 숫자가 작은 순서대로 666을 포함하는 숫자가 나올 때 카운트,
         이 카운트된 변수가 처음 입력한 값과 같을 때 현재 숫자에 대해 반환.
         */
    }
}
