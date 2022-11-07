package October.Pattern_assignments;

public class StarPattern_02_UsingWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 6) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
