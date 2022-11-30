public class SwapNumbersWithoutThirdVariable {
    public static void main(String[] args) {
        int a= 34;
        int b=89;
        System.out.println("Before swap : a="+a + " "+ "b= "+b);
        b=a+b-(a=b);

        System.out.println(("After swap  : a="+a + " "+ "b= "+b));

    }
}
