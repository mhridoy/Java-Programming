package January;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        String userName = "aisha";
        String passWord = "985426";

        System.out.println("Plz.Input your Username");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();

        System.out.println("Input your password");
        String password = input.nextLine();

        if (userName.contentEquals(username) && passWord.contentEquals(password)) {
            System.out.println("Login Successfull");
        } else {
            System.out.println("Wrong UserName/Password...Try Again ... >>> ");
        }
    }
}