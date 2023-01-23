package January.String;

import java.util.HashSet;

public class AnargramCheck {

    public static void main(String args[]) {
        String first = "mother";
        String second = "father";
        boolean result = isAnagram(first.toLowerCase().trim() , second.toLowerCase().trim());
        System.out.println("Is Anagram = "+result);
    }

    public static boolean isAnagram(String first, String second) {

        if(first.length() != second.length())
            return false;

        HashSet hs = new HashSet();
        for(char ch : first.toCharArray()) {
            hs.add(ch);
        }
        for(char ch : second.toCharArray()) {
            /* if char is allowed in hashset then it means two strings do not contains same chars */
            if(hs.add(ch))
                return false;
        }
        return true;
    }
}
