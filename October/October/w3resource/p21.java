package October.w3resource;

public class p21 {
    public static void main(String[] args) {

            int t=9;
            int sum=0;

        for (int i = 1; i <= 5; i++) {
                sum=sum+t;
                System.out.print(t+" ");
                t=10*t+9;

            }
        System.out.println();
            System.out.println("sum = "+sum);
        }
    }