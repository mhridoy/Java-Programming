package March.CollectionsDemo;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap m = new HashMap<>();
        HashMap<Integer,String> hm = new HashMap<>();

        m.put(101,"Bread");
        m.put(102,"Banana");
        m.put(103,"Oat");

        System.out.println(m);
    }
}
