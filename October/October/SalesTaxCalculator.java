package October;

import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float amount,total,tax;
        final float Sales_tax = .0825F;

        System.out.println("Please enter amount spent : ");
        amount = in.nextFloat();

        tax=amount*Sales_tax;
        total = amount+tax;

        System.out.println("          Recipt");
        System.out.println("----------------------------");
        System.out.println("Amount:\t  "+ amount);
        System.out.println("Tax Rate: "+Sales_tax*100);
        System.out.println("Tax :     "+ tax);
        System.out.println("Total :   "+total);


    }
}
