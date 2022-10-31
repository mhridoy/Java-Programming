package October.w3resource;

public class p27 {
    public static void main(String[] args) {
        int sum = 0;
        int input = 56;
        System.out.println("The positive divisor : ");
        for (int i = 1; i < input; i++) {

            if (input % i == 0) {
                sum = sum + i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("The sum of the divisor is : " + sum);
        if (sum == input)
            System.out.println("The number is perfect.");
        else
            System.out.println("The number is not perfect.");
    }
}

