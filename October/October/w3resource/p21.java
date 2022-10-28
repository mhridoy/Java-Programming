package October.w3resource;

public class p21 {
    public static void main(String[] args) {

            int Se=9;
            int sum=0;

        for (int i = 1; i <= 5; i++) {
                sum=sum+Se;
                System.out.print(Se+" ");
                Se=10*Se+9;

            }
        System.out.println();
            System.out.println("sum = "+sum);
        }
    }