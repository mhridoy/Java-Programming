package November.String;

public class indexAndCountOfCh {
    public static void main(String[] args) {
        String str = "winter is coming";
        int count=0;
        for (int i = 0; i <str.length() ; i++) {

            if(str.charAt(i)=='i')
                System.out.println("index of 'i' = "+ i + " ");

            if(str.charAt(i)=='i'){
                count++;}


            //System.out.println(str.charAt(i)); //print i
        }
        System.out.println();
        System.out.println("Count of 'i' = "  + count);
    }
}

