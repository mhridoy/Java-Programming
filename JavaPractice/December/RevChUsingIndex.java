package December;

public class RevChUsingIndex {
    public static void main(String[] args) {

        char ch[]  = {'a','b','c','d','e','f'};
        int index=1;
        char temp;

        for (int i = 0; i < ch.length/2 ; i++) {
            temp=ch[i];
            ch[i]=ch[ch.length-index];
            ch[ch.length-index]= (char) temp;
            index++;
        }
        for (int i = 0; i < ch.length ; i++) {
            System.out.print(ch[i] + " ");

        }
    }
}

