package October.Pattern_assignments;

public class Pattern_practice_using_whileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 4) {
            int j = 0;
            while (j <= 4) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
