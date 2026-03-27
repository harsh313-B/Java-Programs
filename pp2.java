//program to demonstrate hashSet and Iterator class
import java.util.HashSet;
import java.util.Iterator;

class hsi{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Dragon");
        set.add("Beasts");
        set.add("Monsters");
        set.add("Dragon");

        Iterator<String> itr = set.iterator();

        System.out.println("hash set using Iterator");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(set.contains("Dragon"));
    }
}