package December.ArrayPractice;

public class reverseCharStringIntArray {

    public static void main(String[] args) {
        char c[] = {'a', 'b', 'c', 'd', 'e'};
        char rev[] = new char[c.length];
        int index = 0;
        int count = 1;
        for (int i = 0; i < c.length; i++) {
            rev[index++] = c[c.length - count++];
        }
        for (int i = 0; i < index; i++) {
            System.out.print(rev[i]);
        }
        System.out.println();
        for (int i = c.length-1; i >=0 ; i--) {
            System.out.print(c[i]);
        }
        System.out.println();

        String str[] = {"w", "e", "_", "a", "r", "e","_","H","u","m","a","n"};
        String revStr[] = new String[str.length];
        int index1 = 0;
        int count1 = 1;
        for (int i = 0; i < str.length; i++) {
            revStr[index1++] = str[str.length - count1++];
        }
        for (int i = 0; i < index1; i++) {
            System.out.print(revStr[i]);
        }
        System.out.println();
        for (int i = str.length-1; i >=0 ; i--) {
            System.out.print(str[i]);
        }
        System.out.println();
        int arr[] = {12, 23, 45, 67, 78, 90};
        int index2 = 0;
        int count2 = 1;
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[index2++] = arr[arr.length - count2++];
        }
        for (int i = 0; i < index2; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}


