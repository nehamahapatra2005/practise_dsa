import java.util.*;

public class ListIntersection {

    public static List<Integer> intersection(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>(l1);
        result.retainAll(l2); // keeps only common elements
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

        List<Integer> result = intersection(list1, list2);

        System.out.println("Intersection: " + result);
    }
}