package January;

public class SbRev {
    public static void main(String[] args) {
        int num = 69875;

        StringBuilder sb = new StringBuilder();
        sb.append(num);

        StringBuilder rev= sb.reverse();
        System.out.println(rev);


    }
}
