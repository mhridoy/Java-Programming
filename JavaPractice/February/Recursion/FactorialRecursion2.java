package February.Recursion;

public class FactorialRecursion2 {
    public static void main(String[] args) {
        System.out.println(Fact(1, 5));
    }
    public static int Fact(int lower, int upper) {

        if (lower == upper) {
            return upper;
        } else {
            return lower * Fact(lower + 1, upper);
        }
    }
}

