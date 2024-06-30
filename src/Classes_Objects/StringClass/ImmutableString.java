package Classes_Objects.StringClass;

public class ImmutableString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1;

        System.out.println("Before Modification: ");
        System.out.println("str1 :" +str1);
        System.out.println("str2: " +str2);

        System.out.println("Memory address of str1: " + System.identityHashCode(str1));

        str1 = str1+ "World";

        System.out.println("\nAfter modification: ");
        System.out.println("str1: " +str1);
        System.out.println("str2: " +str2);

        System.out.println(str1 + " " +str2);

        System.out.println("Memory address of str1: " + System.identityHashCode(str1));
//        System.out.println("Memory address of str2: " + System.identityHashCode(str2));



        //in java string objects are immutable, which means their state (the content of the string)
        //cannot be changed after they are created. its value cannot be modified.
        // when you perform operations that seems to modify a string such as concatenation or substring
        // what actually happens is that a new string object is created with the modified content, while
        // the original string remains unchanged.

        String str ="Hello";
        str.concat("World");
        System.out.println(str);

        // in this example concat method is called on the str object, which appends "World" to
        // the end of the string. however, since String objects are immutable, the original str
        // object remains unchanged, and the output still "Hello".
        // if you want to modify a String object, you can create a new string with the modified content.

        String str6= "Hello" ;
        String modifiedstr6 = str6.concat(" " +"World");
        System.out.println(modifiedstr6);




    }


}
