package November;

public class DigitDiv {
    public static void main(String[] args) {

        int num=26;
        double digDiv=1;

        while(num>0){
            int rem=num%10;
            digDiv=digDiv/rem;
            num=num/10;
        }

        System.out.println(digDiv);
    }
}
