package November.String;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Bangladesh";
        String s2 = s1;

        s1 = s2.intern();
        System.out.println(s1 == s2);
    }
}
//We know that the intern() method will return the String object reference
// from the string pool since we assign it back to s2 and
// now both s1 and s2 are having the same reference.
// It means that s1 and s2 references point to the same object.