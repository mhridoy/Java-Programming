package March;

public class DeleteOneElement {
    public static void main(String[] args) {
        int[] arr = {10, 50, 60, 80, 90};
        System.out.print("Array Before delete one element : ");
        for(int x : arr){
            System.out.print( x + " ");
        }

        int delete = 60;
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            if (delete == arr[i]) { //2

                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                count=count+1;
                break;
            }
        }
        System.out.println();
        System.out.print("Array After delete one element : ");
        for (int i = 0; i < arr.length-1 ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
