package January.String;

public class PerfectNumberGivenRange {
    public static void main(String[] args) {
        int start = 5;
        int end = 1000;
        int num;

        for (num = start; num < end; num++) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum = sum + i;
                }
            }
            if (num == sum) {
                System.out.println(num);
            }
        }
    }
}
