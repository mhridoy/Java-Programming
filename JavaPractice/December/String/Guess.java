package December.String;

public class Guess {
    public static void main(String[] args) {
        String st1="java";
        String st2= new String("st1");
        String st3 = new String("java");

        System.out.println(st1==st2);
        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));
        System.out.println(st2==st3);
        System.out.println(st2.equals(st3));

    }
}
