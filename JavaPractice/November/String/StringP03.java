package November.String;

public class StringP03 {
    public static void main(String[] args) {

        String name = "Shahnaz";
        String name2 = " shahnaz begum ";
        String up = name.toUpperCase();
        String low=name.toLowerCase();
        String trim = name2.trim();

       // System.out.println(up + " "+low);
        System.out.println(trim);
        System.out.println(name.concat(name2.trim()));
    }
}
