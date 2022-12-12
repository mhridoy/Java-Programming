package November.String;

public class RemoveGivenCharacterFromString {
    public static void main(String[] args) {
        String word = "Java";
        //replacing character in this String
        String replaced = word.replace("J", "K");
        System.out.println("Replaced String : " + replaced);

        //replacing substring on String in Java
        String str = "Scala is good programming language";
        replaced = str.replaceAll("Scala", "Java");
        System.out.println("String before replace : " + str);
        System.out.println("String after replace : " + replaced);

        //replacing all space in String with # using regular expression
        replaced = str.replaceFirst("\\s", "#");
        System.out.println("Replacing first match of regex using replaceFirst()");
        System.out.println("Original String before replacement : " + str);
        System.out.println("Final String : " + replaced);

        System.out.println("Replacing all occurrence of substring which match regex");
        replaced = str.replaceAll("\\s", "#");
        System.out.println("ReplaceAll Example : " + replaced);
    }

}

