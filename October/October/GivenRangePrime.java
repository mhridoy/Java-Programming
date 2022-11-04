package October;

public class GivenRangePrime {
    public static void main(String[] args) {

        int n1 = 2;
        int n2 = 50;

        for (int number = n1; number <= n2; number++) {
            int count = 0;
            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
