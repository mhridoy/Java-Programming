package November.String;

import java.util.Arrays;
import java.util.Scanner;

public class CountWordsinString {
    public static void main(String[] args) {
        //method 1
        String str2 = "id-INT, name-STRING,";
        String[] parts = str2.split("\\W+");
        System.out.println(parts.length);
        System.out.println(Arrays.toString(parts));

        //method 2
     //   Scanner in = new Scanner(System.in);
      //  System.out.println("Enter you String:");
       // String str = in.nextLine();
//        int count = 1;
//        for (int i = 0; i <str.length() ; i++) {
//            if(str.charAt(i)== ' ' )
//            {
//                count++;
//            }
//        }
       // System.out.println("Number of words in this String is = "+count);

        //method 3
       // String [] s2 = str.split(" ");
      //  System.out.println("Number of words in this String is = "+ s2.length);

        //method 4
        //when there is more than one space in string
       // String[] words=str.split("\\W+");
       // System.out.println(words.length);


    }
}
