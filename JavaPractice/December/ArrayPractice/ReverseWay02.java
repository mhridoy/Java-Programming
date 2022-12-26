package December.ArrayPractice;

public class ReverseWay02 {
    public static void main(String[] args) {


    int arr[]={1,2,3,4,5};
    String str[] = {"D","h","a","k","a"};
    int index=1;
    String temp;

        for (int i = 0; i < str.length/2 ; i++) {
            temp=str[i];
            str[i]=str[str.length-index];
            str[str.length-index]=temp;
            index++;
        }
        for (int i = 0; i < str.length ; i++) {
            System.out.print(str[i]+" ");
        }
//
//        for (int i = 0; i < arr.length/2 ; i++) {
//
//        temp=arr[i];
//        arr[i]=arr[arr.length-index];
//        arr[arr.length-index]=temp;
//        index++;
//
//    }
//        for (int i = 0; i < arr.length ; i++) {
//        System.out.print(arr[i]+" ");
//    }

}}
