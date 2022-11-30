//B. Atilla's Favorite Problem
package November;

import java.util.Arrays;
import java.util.Scanner;

public class CodeforcesRound_835_Div4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testCase = in.nextInt();
        for (int i = 0; i < testCase; i++) {
            int alphabetSize = in.nextInt();
                String s = in.next();
                char ch[] = s.toCharArray();
                Arrays.sort(ch); 
                int position = (int) ch[ch.length - 1];

                System.out.println(position - 96);

            }
        }
    }







