package w3Resource2;

public class pp {
    public static void main(String[] args) {

        int n = 1;
        int count=0;
        for (int i = 2; i <n ; i++) {

            if(n==2&& n==1){
                System.out.println(n + "is prime");
            }

            if (n%i==0){
                count++;
                break;

            }

        }
        if (count==0) {
            System.out.println(n + " is prime");
        }

        else
            System.out.println(n + " is not prime");
        }
    }

