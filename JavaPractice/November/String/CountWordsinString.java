package November.String;

import java.util.Scanner;

public class CountWordsinString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter you String:");
        String str = in.nextLine();
        int count = 1;
        for (int i = 0; i <str.length() ; i++) {

            if(str.charAt(i)== ' ' )
            {
                count++;
            }

        }
        System.out.println("Number of words in this String is = "+count);
    }
}
