package Day_4;

import java.util.Comparator;
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    public Person (String name, int age){
        this.name = name;
        this.age= age;

    }
    public String getName(){
        return name;

    }
    public int getAge(){
        return age;

    }
    public int compareTo (Person other){
        return Integer.compare(this.age, other.age);
    }
    public static  Comparator<Person> nameComparator = new Comparator<Person>() {
        public int compare(Person person1 , Person person2){
            return person1.getName().compareTo(person2.getName());
        }
    };

}


