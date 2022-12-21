package December;

public class FirstDigit {
        public static void main(String[] args) {
            int n=124;
            int firstDigit=0;
            int rem=0;
            for(;n>0;)
            {
                rem=n%10;
                firstDigit=rem;
                n=n/10;
            }
            System.out.println("First Digit--->"+firstDigit);

        }
}
