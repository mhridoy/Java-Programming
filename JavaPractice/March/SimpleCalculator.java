package March;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double FirstNum=input.nextDouble();
        String operator = input.next();
        double SecondNum= input.nextDouble();
        double result=0;

        switch (operator){

            case "+":
                result=FirstNum+SecondNum;
                break;
            case "-":
                result=FirstNum-SecondNum;
                break;
            case "*":
                result=FirstNum*SecondNum;
                break;
            case "/":
                result=FirstNum/SecondNum;
                break;
            default:
                System.out.printf("You have entered wrong operator");
                break;
        }

        System.out.println(result);


    }
}
