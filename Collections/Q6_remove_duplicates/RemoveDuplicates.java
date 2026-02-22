import java.util.*;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        // LinkedHashSet preserves insertion order
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 3, 5);

        List<Integer> result = removeDuplicates(list);

        System.out.println("List after removing duplicates: " + result);
    }
}