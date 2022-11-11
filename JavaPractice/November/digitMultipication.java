package November;

public class digitMultipication {
    public static void main(String[] args) {

        int num=15894;
        int digMul=1;

        while(num>0){
           int rem=num%10;
            digMul=digMul*rem;
            num=num/10;
       }

        System.out.println(digMul);
    }
}
