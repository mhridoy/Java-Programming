package November.String;

public class RevStringUsingCharArray {
    public static void main(String[] args) {
        String str="i love java";
        char ch[]=str.toCharArray();
        String rev="";
        for (int i = 0; i <ch.length ; i++) {
            rev=ch[i] +rev +" ";

        } System.out.print(rev);
    }
}
