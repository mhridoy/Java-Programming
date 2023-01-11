package January;

public class SmsTyping {

    public static void main(String[] args) {
        char ch[] = { 'a', 'b', 'c'};
        char ch1[]= {'d','e','f'};
        char ch2[] ={'g','h','i'};
        char ch3[]={'j','k','l'};
        char ch4[]={'m','n','o'};
        char ch5[]={'p','q','r','s'};
        char ch6[]={'t','u','v'};
        char ch7[]={'w', 'x', 'y', 'z'};
        char ch8[]={' '};
        int count=0;
        String str = "good luck and have fun";//1 2 3 3 3 1 2 1 3 19
        for (int i = 0; i <str.length(); i++) {
            for (int j = 0; j < ch.length ; j++) {
                if(str.charAt(i)==ch[j]   ||str.charAt(i)==ch1[j] ||str.charAt(i)==ch2[j] ||
                        str.charAt(i)==ch3[j] ||str.charAt(i)==ch4[j]||str.charAt(i)==ch5[j]||
                        str.charAt(i)==ch6[j]||str.charAt(i)==ch7[j] ){
                    count=count+(j+1);
                }
            }
            if(str.charAt(i)==ch8[0] ){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
