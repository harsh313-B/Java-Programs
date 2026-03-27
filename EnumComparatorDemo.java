import java.util.*;

// Comparator class
class SortNumbers implements Comparator<Integer> {

    // Compare method
    public int compare(Integer a, Integer b) {
        return a - b;   // Ascending order
    }
}

public class EnumComparatorDemo {
    public static void main(String[] args) {

        // ---------- Enumeration Demo ----------
        Vector<String> v = new Vector<>();

        v.add("Red");
        v.add("Green");
        v.add("Blue");

        Enumeration<String> e = v.elements();

        System.out.println("Using Enumeration:");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        // ---------- Comparator Demo ----------
        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(10);
        list.add(20);

        Collections.sort(list, new SortNumbers());

        System.out.println("Using Comparator:");
        System.out.println(list);
    }
}
