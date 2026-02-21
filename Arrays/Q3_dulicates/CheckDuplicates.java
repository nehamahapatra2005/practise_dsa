import java.util.HashSet;

public class CheckDuplicates {

    public static boolean hasDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                return true; // duplicate found
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};

        if (hasDuplicate(arr)) {
            System.out.println("Array contains duplicates");
        } else {
            System.out.println("No duplicates found");
        }
    }
}