package March;

import java.util.HashMap;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> wordCounts = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            String word = scanner.next();

            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        for (String word : wordCounts.keySet()) {
            System.out.println(word + " " + wordCounts.get(word));
        }
    }
}
