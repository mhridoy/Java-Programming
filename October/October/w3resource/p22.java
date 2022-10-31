package October.w3resource;

public class p22 {
    public static void main(String[] args) {

        int p, q;

        for (int i = 1; i <= 5; i++) {

            if (i % 2 == 0) {
                p = 1;
                q = 0;
            } else {
                q = 1;
                p = 0;
            }

            for (int j = 1; j <= i; j++)
                if (j % 2 == 0)
                    System.out.print(p);
                else
                    System.out.print(q);

            System.out.println();
        }
    }
    }

