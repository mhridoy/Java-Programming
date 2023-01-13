package January;

public class revPracticeUsingtemp {
    public static void main(String[] args) {
        String test = "Welcome";
        char[] ac = test.toCharArray();

        // for(int i =test.length()-1; i>=0;i--){
        // 	System.out.print(test.charAt(i));
        // }
        for (int i = 0; i < ac.length / 2; i++) {
            char temp = ac[i];
            ac[i] = ac[(ac.length - 1) - i];
            ac[(ac.length - 1) - i] = temp;
        }
        for (int i = 0; i < ac.length; i++) {
            System.out.print(ac[i]);
        }
    }
}
