package February.Recursion;
public class FactorialRecursion {
    public static void main(String[] args) {
        int i=1;
        System.out.println(factorial(i));
    }   public static int factorial (int i){
        if(i==5){
            System.out.println(i);
            return 5;
        }
        else {
            System.out.println(i);
            return i*factorial(i+1);
        }
    }
}

