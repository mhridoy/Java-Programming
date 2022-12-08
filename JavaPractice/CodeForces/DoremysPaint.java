import java.util.Scanner;

//package CodeForces;
public class DoremysPaint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testCase = in.nextInt();

        for (int i = 0; i < testCase; i++) {
            int length = in.nextInt();
            int arr[] = new int[length];
            for (int j = 0; j < length; j++) {
                arr[j] = in.nextInt();
            }

            System.out.println(1+" "+length);
        }
    }
}
