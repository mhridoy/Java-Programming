package November.String;

public class RemoveSpecialChar {
    public static void main(String[] args) {

        String str = "$131#@% abcd123 ABCDEF () []";

       String replace = str.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(replace);
    }
}
