package December.String;

public class Concatenation {

    public static void main(String []args)
    {
        StringBuilder stbu=new StringBuilder();
        //Initial object size
        System.out.println(stbu.capacity());
        String str="Paper";
        System.out.println(str);
        String str1 = new String("NewsPaper");
        System.out.println(str1);
        str1 += " Articles";         //string update
        System.out.println(str1);
    }
}
