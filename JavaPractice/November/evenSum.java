package November;
public class evenSum {
    public static void main(String[] args) {
        int num = 15678;
        int sum = 0;
        for (; num > 0; ) {
            int rem = num % 10;
            num = num / 10;
            if (rem % 2 == 0) {
                sum = sum + rem;
            }
        }
        System.out.println(sum);
    }
}
