package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class SSeeeeiinnggDDoouubbllee {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for (int i = 0; i < testCase; i++) {
            String str = in.next();
            String strTemp = "";

            for (int j = str.length()-1; j >= 0; j--) {  //(int j = 0; j <str.length(); j++)
             //   strTemp = str.charAt(j) + strTemp;
                strTemp=strTemp+str.charAt(j);
            }
            System.out.println(strTemp);
            String palindrom = str + strTemp;
            System.out.println(palindrom);
        }
    }
}