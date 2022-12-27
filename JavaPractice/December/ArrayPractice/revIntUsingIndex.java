package December.ArrayPractice;

public class revIntUsingIndex {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int index=1;
        int temp;

        for (int i = 0; i < arr.length/2 ; i++) {

            temp=arr[i];
            arr[i]=arr[arr.length-index];
            arr[arr.length-index]=temp;
            index++;

        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
