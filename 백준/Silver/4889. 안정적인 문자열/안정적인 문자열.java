import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int cycle = 1;

        while (true) {
            String word = br.readLine();
            if (word.contains("-")) {
                break;
            }

            int answer = 0;
            int open = 0; // 여는 괄호의 개수
            
            // 첫 번째 패스: 올바른 괄호쌍 처리
            for (char c : word.toCharArray()) {
                if (c == '{') {
                    open++;
                } else if (c == '}') {
                    if (open > 0) {
                        open--; // 매칭되는 여는 괄호가 있으면 사용
                    } else {
                        answer++; // 여는 괄호로 변경 필요
                        open++;
                    }
                }
            }
            
            // 남은 여는 괄호들 처리
            answer += open / 2; // 짝수 개의 여는 괄호는 서로 닫아줌
            
            System.out.println(cycle + ". " + answer);
            cycle++;
        }
    }
}