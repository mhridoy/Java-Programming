package November.String;

public class RevString {

        public static void main(String[] args) {
            String str= "bangladesh";

            for (int i = str.length()-1; i >=0 ; i--) {
                int position=str.charAt(i)-32;
                //System.out.print(str.charAt(i));
                System.out.print((char)position);

            }
        }
    }


