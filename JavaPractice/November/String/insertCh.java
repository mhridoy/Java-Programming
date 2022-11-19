package November.String;

public class insertCh {
    public static void main(String[] args) {

        String str = "i like photography";

        for (int i = 0; i <str.length() ; i++) {

            int position=str.charAt(i)-32;

            if(i==1)
                position=i+31;
            
            System.out.print((char)position);

        }

    }
}
