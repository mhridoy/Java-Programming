package October;

public class array {
    public static void main(String[] args) {
        int array[];
        array = new int[10];
        int crray[] = new int[10];
        int drray [] = {10,11,12,13};

        int Method1[] = test(array);
        int Method2 [] = test(10);

        System.out.println("Method 1");
        for (int i : Method1) {
            System.out.print(i+" ");
        }
        System.out.println("Method 2 ");

        for (int i : Method2) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static int [] test (int array[]){

        return new int [] {1,2,3};
    }
    public static int [] test (int sum){
        int sample [] = {1,2,3};
        return sample;
    }
}
