package December;
//Write a program to sum of random numbers
import java.util.Arrays;

public class SumOfRandomNumbers {

    public static void main(String[] args) {
        double sum = 0;
        double[] d = new double[5];
        for (int i = 0; i < d.length; i++) {
            d[i] = Math.random() * 50;
            sum += d[i];
        }
        System.out.println("The random numbers are: " + Arrays.toString(d));
        System.out.println("The sum is: " + sum);
    }
}
