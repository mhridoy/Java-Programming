package February.Recursion;
public class RecursionSumOffEven {
    public static void main(String[] args) {
        int i=10;
        System.out.println(sumOffOdd(1,i));//30
    }
    public static int sumOffOdd(int lower,int upper){

        if(lower>upper){
            return 0;}
        if(lower%2==0){
            return lower+sumOffOdd(lower+2,upper);
        }
        else {
            return sumOffOdd(lower+1,upper);
        }
    }
}
