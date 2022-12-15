package December.ArrayPractice;

public class ArraySum {
    public class array01 {
        public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        System.out.println("Enter array length ");
        int length=in.nextInt();
        int [] arr = new int[length];*/

            int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                // System.out.print(arr[i]+" ");
            }
            int[] arr2 = new int[arr.length];
            for (int i = 0; i < arr2.length - 2; i = i + 2) {
                arr2[index++] = arr[i] + arr[i + 1];
            }
            for (int i = 0; i < index; i++) {
                System.out.print(arr2[i] + " ");

            }
        }
    }

}
