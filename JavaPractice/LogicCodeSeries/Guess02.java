package LogicCodeSeries;

public class Guess02 {
    public static void main(String[] args) {
        int i=1,j=10;
        do {
            if (i++ > --j) {
                continue;
            }
        }
        while(i<5);
        System.out.println(i + "," + j);
    }
}
