package March.CollectionsDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
       // HashMap m = new HashMap<>();
        HashMap<Integer,String> m = new HashMap<>();

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
        m.put(103,"Apricot");
        System.out.println(m.containsKey(102));//true
        System.out.println(m.containsKey(103)); //false
        System.out.println(m.containsValue("Apple")); //True
        System.out.println(m.containsValue("Oat")); //False
        System.out.println(m.isEmpty()); //false

        System.out.println(m.keySet());

//        for(int i: m.keySet()){
//            System.out.println(i);
//        }

        System.out.println();
        for(Object i:m.keySet()){
            System.out.println(i);
        }
        System.out.println(m.values());

        for (Object i: m.values()
             ) {
            System.out.println(i);
        }

        System.out.println( " Key + value");
        for (Object i: m.keySet()) {

            System.out.println(i + " " + m.get(i));

        }

        //Entry Methods
        System.out.println(m.entrySet());

        for (Map.Entry entry : m.entrySet()) {
            System.out.println(entry);

        }





    }
}
