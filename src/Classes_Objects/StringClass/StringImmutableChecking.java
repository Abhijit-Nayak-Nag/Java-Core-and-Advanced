package Classes_Objects.StringClass;

public class StringImmutableChecking {
    public static void main(String[] args) {
        String str= "Hello";
        System.out.println(str);
        System.out.println("Memory address of str1: " + System.identityHashCode(str));

        str=str+"World";
        System.out.println(str);
        System.out.println("Memory address of str1: " + System.identityHashCode(str));

    }
}
