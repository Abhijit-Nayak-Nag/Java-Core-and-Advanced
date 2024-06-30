package Classes_Objects.StringClass;

public class Excercise1 {
    public static void main(String[] args) {
        String str= "Hello World";
        System.out.println(getCharacterAtIndex("Hello",3));
        System.out.println(getCharacterAtIndex(str, 22));

    }

    public static char getCharacterAtIndex(String str, int index) {
        if (index >= 0 && index < str.length()) {
            return str.charAt(index);
        } else {
            return '\0'; // Return null character if index is out of range
        }
    }
}
