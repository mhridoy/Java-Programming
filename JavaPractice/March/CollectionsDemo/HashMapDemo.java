package March.CollectionsDemo;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap m = new HashMap<>();
        HashMap<Integer,String> hm = new HashMap<>();

        m.put(101,"Bread");
        m.put(102,"Banana");
        m.put(103,"Oat");
        m.put(104,"Orange");
        m.put(102,"Apple");
        m.put(105,"Apple");

        System.out.println(m);

        System.out.println(m.get(104));
        m.remove(103);
        System.out.println(m);
        System.out.println(m.containsKey(102));//true
        System.out.println(m.containsKey(103)); //false
    }
}
