package February.Recursion;

public class Factorial_Recursion {
    public static void main(String[] args) {
        int i=5;
        System.out.println(factorial(5));
    }   public static int factorial (int i){
        if(i==0||i==1){
            System.out.println(i);
            return 1;
        }
        else {
            System.out.println(i);
            return i*factorial(i-1);
        }
   }

}
