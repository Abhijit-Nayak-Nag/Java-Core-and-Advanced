package functional.programming.stream;

public class Father extends Person{
    public Father(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        Father.hello();
        Father father= new Father("Sukant",47);
        System.out.println(father);
        System.out.println(father.name);
        System.out.println(father.age);
        System.out.println(father);
        father.displayInfo();
        hello();

    }
}
