package Classes_Objects.StringClass;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Abhi";
        int marks = 45;

        System.out.println("Hello " +name + ", Your mark is: " +marks);
        System.out.printf("Hello %s, Your  marks is: %d", name, marks);
    }
}
