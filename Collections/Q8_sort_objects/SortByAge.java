import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SortByAge {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        list.add(new Person("Alice", 25));
        list.add(new Person("Bob", 20));
        list.add(new Person("Charlie", 30));

        // Sort by age using Comparator
        list.sort(Comparator.comparingInt(p -> p.age));

        System.out.println("Sorted by age:");
        for (Person p : list) {
            System.out.println(p.name + " - " + p.age);
        }
    }
}