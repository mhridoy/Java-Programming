package November;
import java.util.Scanner;

public class SwitchCase_NumbersInWord {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scn.nextInt();
        String str = "";

        while (n > 0) {
            int rem = n % 10;
            
            n = n / 10;
            str =rem+str;

        }
         System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            switch (c) {
                case '0':
                    System.out.println("Zero ");
                    break;
                case '1':
                    System.out.println("One ");
                    break;
                case '2':
                    System.out.println("Two ");
                    break;
                case '3':
                    System.out.println("Three ");
                    break;
                case '4':
                    System.out.println("Four ");
                    break;
                case '5':
                    System.out.println("Five ");
                    break;
                case '6':
                    System.out.println("Six ");
                    break;
                case '7':
                    System.out.println("Seven ");
                    break;
                case '8':
                    System.out.println("Eight ");
                    break;
                case '9':
                    System.out.println("Nine ");
                    break;
                default:
            }
        }
    }
}


