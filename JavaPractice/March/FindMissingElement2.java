package March;

public class FindMissingElement2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 7, 8, 11};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] != array[i] + 1) {
                System.out.println("MISSING ELEMENT " + (array[i] + 1));
            }
        }
    }
}
