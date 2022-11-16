package November;

public class StringP01 {
    public static void main(String[] args) {
      //  Scanner in = new Scanner(System.in);
       // String name = in.nextLine();

       String name1= "shahnaz";

//
//        for (int i = 0; i <name1.length() ; i++) {
//            System.out.println(name1.charAt(2));
//        }

        for (int i = 0; i <name1.length() ; i++) {
            System.out.print(((int)name1.charAt(i))-32+" ");

        }

        for (char i = 'a'; i <='z' ; i++) {
            int position = (int) i- 32;
            System.out.print((char)position + " ");
           // System.out.println((int) i);

        }

        for (int i = 65; i <=90 ; i++) {
            System.out.print ((char) i + " ");

            if(i==90)
                System.out.print("\n");
        }



      //  System.out.print("\n");

        for (int i = 97; i <=122 ; i++) {
            System.out.print ((char) i + " ");
        }

        System.out.println();
        System.out.print(name1.charAt(2)+"\n");
        System.out.println((char) 65);


    }
}
