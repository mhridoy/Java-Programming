package December;

import java.util.Scanner;

public class PyramidPalindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1;j<=i; j++){
                System.out.print(j);
            }
            for(int k=i; k>1;k--){
                System.out.print(k-1);
            }
            System.out.println();
        }
    }
}
