import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= Integer.parseInt(input[0]); i++) {
            queue.add(i);
        }
        bw.write('<');
        while(queue.size() > 1) {
            for (int i = 0; i < Integer.parseInt(input[1]) - 1; i++) {
                int front = queue.remove();
                queue.add(front);
            }
            bw.write(queue.remove() + ", ");
        }
        bw.write(queue.remove() + ">");
        bw.flush();
        bw.close();
    }
}