import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int comLine = Integer.parseInt(br.readLine());
        LinkedList<Character> links = new LinkedList<>();


        for (int i = 0; i < str.length(); i++) {
            links.addLast(str.charAt(i));
        }

        ListIterator<Character> iter = links.listIterator();
        while (iter.hasNext()) {
            iter.next();
        }

        for (int i = 0; i < comLine; i++) {
            String command = br.readLine();
            char com = command.charAt(0);
            if (com == 'L' && iter.hasPrevious()) {
                iter.previous();
            }
            else if (com == 'D' && iter.hasNext()) {
                iter.next();
            }
            else if (com == 'B' && iter.hasPrevious()) {
                iter.previous();
                iter.remove();
            }
            else if (com == 'P') {
                char cVal = command.charAt(2);
                iter.add(cVal);
            }
        }
        for (Character c : links) {
            bw.write(c);
        }
        bw.flush();
        bw.close();
    }
}