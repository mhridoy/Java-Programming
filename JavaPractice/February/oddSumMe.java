package February;

public class oddSumMe {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(sum(i));
    }
    public static int sum(int i) {
        if (i == 0) {
            return 0;
        }
        else if (i%2== 0) {
            return i-1+sum(i-1);
        } else {
            return sum(i - 1);
        }
    }
}





//9+7+5+3+1=25


















// return i + 1 - 2 + sum(i - 1);//10+1-2=9 >> 8+1-2=7 >>6+1-2=5 >> 4+1-2=3 >>2+1-2=1