package October.w3resource;

public class p26 {
    public static void main(String[] args) {

        int t=1;
        int sum = 0;

        for (int i = 1; i <=5 ; i++) {
            System.out.print(t);
            if(i<5){
                System.out.print("+ ");
            }

            sum=sum+t;
            t=t*10+1;
        }
        System.out.println();
        System.out.println("The Sum is : "+sum);
    }
}
