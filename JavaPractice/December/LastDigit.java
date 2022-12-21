package December;

public class LastDigit {
    public static void main(String[] args) {

        int n=124;
        int lastDigit=0;
        int rem=0;
        for(;n>0;)
        {
            rem=n%10;
            lastDigit=rem;
            n=n/10;
            break;
        }
        System.out.println("Last Digit--->"+lastDigit);
    }
}
