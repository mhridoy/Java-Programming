package November.String;

public class oneChUppercase {
    public static void main(String[] args) {
        String name= "shahnaz";
        String temp="";

      for (int i = 0; i <name.length() ; i++) {
            int position = name.charAt(i);

            if(i==4)
                position=name.charAt(i)-32;

           // temp=temp+(char)position;

        //  System.out.println(temp);

          //   System.out.print((char) position);

            //int position= name.charAt(4)-32;
         // System.out.println((char) position);
        }
    }
}
