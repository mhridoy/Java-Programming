package January;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random  random = new Random();
        int num = random.nextInt(9);
        double dbl = random.nextDouble();
        boolean x= random.nextBoolean();
       // System.out.println(num);
        //System.out.println(dbl);
        System.out.println(x);
    }
}
