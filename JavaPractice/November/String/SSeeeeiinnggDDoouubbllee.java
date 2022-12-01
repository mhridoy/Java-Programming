package November.String;

import java.util.Arrays;

public class SSeeeeiinnggDDoouubbllee {
    public static void main(String[] args) {

        String s = "errorgorn";
        String s2 = s;
       String s3=s+s2;
        System.out.println(s3);
        char[] ch = s3.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);

    }
}