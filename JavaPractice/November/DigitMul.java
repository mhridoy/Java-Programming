package November;

public class DigitMul {
    public static void main(String[] args) {
        int num= 15894;

        int vf1=num/10;
        int dig1=num%10;

        int vf2=vf1/10;
        int dig2=vf1%10;

        int vf3=vf2/10;
        int dig3=vf2%10;

        int vf4=vf3/10;
        int dig4=vf3%10;

        int vf5=vf4/10;
        int dig5=vf4%10;

        int digitMulti=dig1*dig2*dig3*dig4*dig5;
        double digitDiv=dig2/dig2;
        System.out.println(digitMulti);

    }
}
