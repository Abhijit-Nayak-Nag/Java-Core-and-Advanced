package functional.programming.stream;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void displayInfo(){
        System.out.println("Name: " + name + "\nAge: " + age);
//        System.out.printf("Name:, Age: %d%d", name, age);
    }
    public static void hello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Person person= new Person("Abhijit", 22);
        person.name="sss";
        System.out.println(person.name);
        System.out.println(person);
        person.displayInfo();


//        System.out.println(person.name +" "+ person.age);

    }
}
