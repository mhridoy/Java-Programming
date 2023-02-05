package February;

public class TEXQuotes {

    public static void main(String[] args) {
        String str = "\"To be or not to be,\"";
        char moremore[] = str.toCharArray();
        char more[] = new char[str.length() + 10];
        int mindex = 0;
        int[] arr = new int[10];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '"') {
                arr[index++] = i;
                more[mindex++] = str.charAt(i);

            } else more[mindex++] = str.charAt(i);
        }
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < index; i++) {
            if (i % 2 == 0) {
                more[arr[i]] = '`';
                more[arr[i] + 1] = '`';

            } else {
                more[arr[i]] = '\'';
                more[arr[i] + 1] = '\'';
            }

        }
        for (int i = 0; i < more.length; i++) {

            System.out.print(more[i]);
        }
    }
}
