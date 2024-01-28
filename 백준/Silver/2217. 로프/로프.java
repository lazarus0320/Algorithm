import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            tmp = arr[i] * (arr.length - i);
            if (max < tmp) {
                max = tmp;
            }
        }
        System.out.println(max);
        /**
         * 오름차순 정렬
         * arr[i] * arr.length - i;
         * 이 값들중 최댓값을 갱신해서 반환
         */
    }
}
