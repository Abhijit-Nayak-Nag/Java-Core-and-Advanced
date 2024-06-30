package functional.programming.dateandtime;


public class Child {
    public static void main(String[] args) {
        Person per= new Person();
        per.hello();
        System.out.println(per.getClass());
        System.out.println(Child.class);
        System.out.println(Person.class);


    }
}
