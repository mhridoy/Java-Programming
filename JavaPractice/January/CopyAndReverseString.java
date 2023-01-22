package January;

public class CopyAndReverseString {
    public static void main(String[] args) {
        String org_str="Shahnaz";
        char ch[]= org_str.toCharArray();
        int size= ch.length;
        char Copy[]=new char[size];
        char Reverse[]=new char[size];
        int i=0;
        while (i!=size){
            Copy[i] =ch[i];
            Reverse[size-1-i]=ch[i];
            i++;
        }
        System.out.println("Original String  >> " + org_str);
        System.out.print("Copied String >> ");
        System.out.println(Copy);
        System.out.print("Reversed String >> ");
        System.out.println(Reverse);
    }
}
