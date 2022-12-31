package December;

public class RevStrUsingIndexWay02 {
    public static void main(String[] args) {
        String str[]={"d","h","a","k","a"};
        int index=1;
        String temp;

        for (int i = 0; i < str.length/2 ; i++) {

            temp= str[i];
            str[i]= str[str.length-index];
            str[str.length-index]= temp;
            index++;
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]+" ");
        }
    }
}
