import java.io.*;
import java.util.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int comLine = Integer.parseInt(str);
        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < comLine; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String com = st.nextToken();
            if (com.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            }
            else if (com.equals("pop")) {
                if (stack.isEmpty()) bw.write("-1"+ "\n");
                else {
                    int popVal = stack.pop();
                    bw.write(popVal + "\n");
                }
            }
            else if (com.equals("size")) {
                bw.write(stack.size() + "\n");
            }
            else if (com.equals("empty")) {
                if (stack.isEmpty()) bw.write("1" + "\n");
                else bw.write("0" + "\n");
            }
            else if (com.equals("top")) {
                if (stack.isEmpty()) bw.write("-1" + "\n");
                else {
                    int topVal = stack.peek();
                    bw.write(topVal + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}