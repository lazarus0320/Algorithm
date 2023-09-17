import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int bs(List<Integer> x, int key, int ps, int pl) {
        while (true) {
            int pc = (ps + pl) / 2;
            if (ps > pl) {
                return 0;
            } else if (x.get(pc) == key) {
                return 1;
            } else if (x.get(pc) < key) {
                ps = pc + 1;
            } else if (x.get(pc) > key) {
                pl = pc - 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the number of cards
        int N = Integer.parseInt(br.readLine());
        List<Integer> cards = new ArrayList<>();

        // Read the cards
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(cards);

        // Read the number of candidates
        int M = Integer.parseInt(br.readLine());
        List<Integer> candidates = new ArrayList<>();

        // Read the candidates
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            candidates.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < M; i++) {
            System.out.print(bs(cards, candidates.get(i), 0, cards.size() - 1) + " ");
        }
    }
}
