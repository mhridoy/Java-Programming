package w3Resource2;

public class givenPrime {
    public static void main(String[] args) {
        int minNum = 2;
        int maxNum = 50;
        int sum = 0;
        for (int num = minNum; num < maxNum; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print (num+ " ");
                sum = sum + num;
            }
        }
        System.out.println();
        System.out.println("Sum is = "+ sum);
    }
}

