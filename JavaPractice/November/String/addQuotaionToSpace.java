package November.String;

public class addQuotaionToSpace {
    public static void main(String[] args) {
        String str = "i like football";

        for (int i = 0; i <str.length() ; i++) {
            int position= str.charAt(i);

            if(i==1)
                position=str.charAt(i)+2;
            if(i==6)
                position=str.charAt(i)+2;
            System.out.print((char) position);
        }

    }
}
