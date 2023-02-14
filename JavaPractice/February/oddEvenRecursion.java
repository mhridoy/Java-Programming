package February;
public class oddEvenRecursion {
    public static void main(String[] args) {
        int n = 1;
        checkEvenOdd(n);
        System.out.println(isEven(11));
    }

    public static void checkEvenOdd(int n) {
        if (n > 10) {
            return;
        } else {
            System.out.print(n + " is ");
            if (isEven(n)) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
            checkEvenOdd(n + 1);
        }
    }
    public static boolean isEven(int n) {

        if (n == 0) {
            return true;
        } else if (n == 1) {
            return false;
        } else {
            return isEven(n - 2);
        }
    }
}