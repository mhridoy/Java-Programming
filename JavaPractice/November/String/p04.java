package November.String;

public class p04 {
    public static void main(String[] args) {
        String str = "i like football";

        for (int i = 0; i <str.length() ; i++) {
            int position= str.charAt(i);

            if(i==1)
                position=str.charAt(1)+2;
            if(i==6)
                position=str.charAt(6)+2;
            System.out.print((char) position);
        }

    }
}
