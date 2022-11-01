package October.w3resource;

public class p39 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 100; i <= 200; i++) {

            if (i % 9 == 0) {

                System.out.println(i);
                sum = sum + i;
            }

        }
        System.out.println();
        System.out.println(sum);
    }

}
