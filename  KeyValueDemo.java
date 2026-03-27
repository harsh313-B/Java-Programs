import java.util.HashMap;
import java.util.Scanner;

class KeyValueDemo {
    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        // Accept data
        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Key: ");
            int key = sc.nextInt();

            System.out.print("Enter Value: ");
            String value = sc.next();

            map.put(key, value);
        }

        // Display key-value pairs
        System.out.println("\nKey - Value Pairs:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        sc.close();
    }
}
