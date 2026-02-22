import java.util.*;

public class ListSetConversion {

    public static void main(String[] args) {
        // Original list with duplicates
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        // Convert List to Set (removes duplicates)
        Set<Integer> set = new HashSet<>(list);

        // Convert Set back to List
        List<Integer> newList = new ArrayList<>(set);

        System.out.println("Original List: " + list);
        System.out.println("Set (duplicates removed): " + set);
        System.out.println("List from Set: " + newList);
    }
}