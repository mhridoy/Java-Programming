package December.ArrayPractice;

public class reverseStrUsingindex {
    public static void main(String[] args) {

        String str[] = {"b", "a", "_","n", "g", "l","a"};
        String rev[] = new String[str.length];
        int index = 0;
        int count = 1;
        for (int i = 0; i < str.length; i++) {
            rev[index++] = str[str.length - count++];
        }
        for (int i = 0; i < index; i++) {
            System.out.print(rev[i]);
        }
    }
}