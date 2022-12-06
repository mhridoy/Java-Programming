package November.String;

public class StrEqual {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "hello";
        if (str1 == str2) {
            System.out.println("str1 and str2 equal");
        } else {
            System.out.println("str1 and str2 not equal");
        }
        if (str1 == str3) {
            System.out.println("str1 and str3 equal");
        } else {
            System.out.println("str1 and str3 not equal");
        }
    }
}
