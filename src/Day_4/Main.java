package Day_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Day_4.Person> People = new ArrayList<>();
        People.add(new Day_4.Person("Alice", 25));
        People.add(new Day_4.Person("Bob", 30));
        People.add(new Day_4.Person("Abhi", 23));
        Collections.sort(People);
        System.out.println("sorted by age");
        for (Day_4.Person person : People) {
            System.out.println(person.getName() + " : " + person.getAge());
        }
        Collections.sort(People, Day_4.Person.nameComparator);
        System.out.println("\nSorted by name: ");
        for (Person person : People) {
            System.out.println(person.getName() + " : " + person.getAge());
        }
    }
}
