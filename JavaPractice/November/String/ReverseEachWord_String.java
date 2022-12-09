package November.String;

public class ReverseEachWord_String {
    public static void main(String[] args) {
        String str = "World is beautiful";
        String strRev = "";
        String words[] = str.split(" "); //str.split("//s");
        for (String w : words) {
            String revWord = "";
            for (int i = 0; i < w.length(); i++) {
                revWord = w.charAt(i) + revWord;
            }
            strRev = strRev + revWord + " ";
        }
        System.out.println(strRev);
    }
}
