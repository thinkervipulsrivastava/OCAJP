import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        // Add a element in the ArrayList
        list.add(0);
        // Add a element at a specified position in the ArrayList
        list.add(0, 1);
        list.add(2);
        list.add(3);
        // Replace a element at a specified position in the ArrayList
        list.set(0, 2);
        // Remove a element in the ArrayList
        list .remove(0);
        System.out.println(list.get(0));
        System.out.println(list);
    }
}
