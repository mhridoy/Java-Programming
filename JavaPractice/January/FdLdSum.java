package January;

public class FdLdSum {
    public static void main(String[] args) {
        int number = 123456;
        int firstDigit=0 ;
       while(number>0) {
            int rem=number%10;
            firstDigit=rem;
            number=number/10;
        }
        System.out.println(firstDigit);
        int lastDigit = number % 10;
        System.out.println(lastDigit);
        System.out.println(firstDigit+lastDigit);
    }
}
