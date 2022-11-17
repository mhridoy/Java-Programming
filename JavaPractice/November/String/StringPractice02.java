package November.String;

public class StringPractice02 {
    public static void main(String[] args) {
        String name= "shahnaz";

      for (int i = 0; i <name.length() ; i++) {
            int poition = name.charAt(i)-32;
            System.out.print((char) poition);
        }


    }
}
