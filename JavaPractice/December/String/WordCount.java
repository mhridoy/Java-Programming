package December.String;

public class WordCount {
    public static void main(String[] args) {
        String str = " i love  java    ";
        String str2=str.trim();
        int wordCount = str2.split("\\s+").length;
        System.out.println(wordCount);
    }
}