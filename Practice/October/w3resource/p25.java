package October.w3resource;

public class p25 {
    public static void main(String[] args) {

        int sum = 0;

        System.out.println("The square natural upto 5 terms are :");
        for (int i = 1; i <= 5; i++) {

            System.out.print(i * i + " ");

            sum = sum + i * i;
        }
        System.out.println();
        System.out.println("The Sum of Square Natural Number upto 5 terms =" + sum);
    }
}
