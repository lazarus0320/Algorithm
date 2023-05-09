import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] plusCal = br.readLine().split("-");
        int answer = 0;
        for (int i = 0; i < plusCal.length; i++) {
            int sum = 0;
            String[] minusCal = plusCal[i].split("\\+");
            for (int j = 0; j < minusCal.length; j++) {
                sum += Integer.parseInt(minusCal[j]);
            }
            if (i == 0) answer += sum;
            else answer -= sum;
        }
        System.out.println(answer);
    }
}