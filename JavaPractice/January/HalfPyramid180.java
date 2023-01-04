package January;
    public class HalfPyramid180 {
        public static void main(String[] args) {
            int n = 4;
            for(int i=1; i<=n; i++) {
                //First pyramid
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            //reverse pyramid
            for(int i=n-1; i>=1; i--) {
                //First pyramid
                for (int j =n-1; j>=i; j--) {
                    System.out.print(" ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

