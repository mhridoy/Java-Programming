package February;

import java.util.ArrayList;

public class CommonElements {


    public static void main(String[] args) {
        // Create two ArrayLists
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Create a third ArrayList to store common elements
        ArrayList<Integer> common = new ArrayList<Integer>();

        // Loop through the first ArrayList and check if each element is in the second ArrayList
        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                common.add(list1.get(i));
            }
        }

        // Print the common elements
        System.out.println("Common Elements: " + common);
    }
}
