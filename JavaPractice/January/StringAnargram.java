package January;

import java.util.Arrays;

public class StringAnargram {
    public static void main(String[] args) {
        String str = " I m a Student ";
        String stri = " A m i detstu ";
        String str1= str.replace(" ","").trim().toLowerCase();
        String str2= stri.replace(" ","").trim().toLowerCase();
        char[] chone = str1.toCharArray();
        char[] chtwo = str2.toCharArray();
        Arrays.sort(chone);
        Arrays.sort(chtwo);
        System.out.println(chone);
        System.out.println(chtwo);

        boolean result = Arrays.equals(chone,chtwo);

            if(result==true){
                System.out.println("Strings are Anargram");
            }
        else {
                System.out.println("Strings are not Anargram");
            }

    }
}
