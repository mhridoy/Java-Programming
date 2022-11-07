package October.w3resource;

public class p21 {
    public static void main(String[] args) {

            int Series=9;
            int sum=0;

        for (int i = 1; i <= 5; i++) {
            System.out.print(Series+" ");
                sum=sum+Series;
                Series=10*Series+9;

            }
        System.out.println();
            System.out.println("sum = "+sum);
        }
    }