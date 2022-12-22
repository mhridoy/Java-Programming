package December.ArrayPractice;
import java.util.Scanner;
    public class IndexOddEven {
        public static void main(String[] args) {
            //  Scanner in = new Scanner(System.in);
            // int length = in.nextInt();
            int arr[] = {1,2,3,4,5,6};
            int index1=0;
            int index2=0;
            int sum1=0;
            int sum2=0;
            int store1[]=new int[6];
            int store2[]=new int[6];
            // for (int i = 0; i <arr.length; i++) {
            //   arr[i]=in.nextInt();
            //}
            for (int i = 0; i <arr.length ; i++) {
                if(i%2!=0)
                {
                    store1[index1++]=arr[i];
                }
                if(i%2==0)
                {
                    store2[index2++]=arr[i];
                }
            }
            System.out.print("odd position >> ");
            for (int i = 0; i <index1 ; i++) {
                int result1=store1[i]+5;
                System.out.print(result1 + " ");
                sum1=sum1+result1;

            }
            System.out.println();
            System.out.print("even position >> ");
            for (int i = 0; i <index2 ; i++) {
                int result2=store2[i]+5;
                System.out.print(result2 + " ");
                sum2=sum2+result2;
            }
            System.out.println();
            System.out.println("Sum of 1st array : "+sum1);
            System.out.println("Sum of 2nd array : "+sum2);
        }
    }



