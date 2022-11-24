// Java program to find longest common prefix of given array of words.
package November.String;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix gfg = new LongestCommonPrefix();
        String[] input = {"autobiography", "autograph", "autonomy"};
        System.out.println("The longest Common Prefix is : " +
                gfg.longestCommonPrefix(input));
    }

    public String longestCommonPrefix(String[] a) {
        int size = a.length;

        if (size == 0)
            return "";

        if (size == 1)
            return a[0];

        Arrays.sort(a);


        int end = Math.min(a[0].length(), a[size - 1].length());


        int i = 0;
        while (i < end && a[0].charAt(i) == a[size - 1].charAt(i))
            i++;

        String pre = a[0].substring(0, i);
        return pre;
    }


}