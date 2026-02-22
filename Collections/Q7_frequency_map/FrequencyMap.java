import java.util.*;

public class FrequencyMap {

    public static Map<String, Integer> frequency(String[] arr) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        return map;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apple", "orange", "banana", "apple"};

        Map<String, Integer> result = frequency(arr);

        System.out.println("Frequency of elements: " + result);
    }
}