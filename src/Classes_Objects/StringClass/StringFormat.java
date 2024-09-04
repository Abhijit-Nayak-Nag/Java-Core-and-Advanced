package Classes_Objects.StringClass;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Abhi";
        int marks = 45;

        System.out.println("Hello " +name + ", Your mark is: " +marks);
        System.out.printf("Hello %s, Your  marks is: %d", name, marks);
        System.out.print("Hello " + name + " " + "Your mark is : " + marks);
    }
}
        /*

it will print in the new line because we didn't use println instead of we used print, so it will appear
in the single line if you want to print this statement in the new line then we need to use "println" or
we can use "\n" for the printing the statement in the next line. "\n" is a part of escape sequence we used this
to print our statement in the new or next line. you can also use "println" method if you want to skip the "\n".

         */


