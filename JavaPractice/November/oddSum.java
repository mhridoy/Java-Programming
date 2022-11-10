package November;

public class oddSum {
    public static void main(String[] args) {

        int num = 12234;
        int sum=0;

        for (; num >0 ; ) {

            int rem = num % 10;
            System.out.println(rem);
            num = num / 10;

            if (rem % 2 == 0)
                System.out.println(rem + " even");
            else
            { System.out.println(rem + " odd");

            sum=sum+rem;
        }

        }
        System.out.println(sum);
    }
}
