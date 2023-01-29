package January.String;

public class CodePointCount {


    public static void main(String[] args) {

        String str = "javaStudent";
        System.out.println("Original String : " + str);

        // codepoint from index 1 to index 11
        int ctr = str.codePointCount(1, 11);

        // prints character from index 1 to index 10
        System.out.println("Codepoint count = " + ctr);
    }
}
