import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {

        // Create HashSet object
        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate (will be ignored)

        // Create Iterator object
        Iterator<String> itr = set.iterator();

        // Display elements using Iterator
        System.out.println("HashSet Elements:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
