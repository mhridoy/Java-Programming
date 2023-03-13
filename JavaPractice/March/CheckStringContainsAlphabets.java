package March;

public class CheckStringContainsAlphabets {

    public static boolean containsOnlyAlphabets(String str) {

        return str.matches("[a-zA-Z]+");
    }
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello123";

        if (containsOnlyAlphabets(str1)) {
            System.out.println(str1 + " contains only alphabets");
        } else {
            System.out.println(str1 + " does not contain only alphabets");
        }
        if (containsOnlyAlphabets(str2)) {
            System.out.println(str2 + " contains only alphabets");
        } else {
            System.out.println(str2 + " does not contain only alphabets");
        }
    }
}
