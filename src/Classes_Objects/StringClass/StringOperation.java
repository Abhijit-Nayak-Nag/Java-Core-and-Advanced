package Classes_Objects.StringClass;

import java.util.Arrays;

public class StringOperation {
    public static void main(String[] args) {
        String str= "Hello, World!";
        // String Length
        //int length = str.length();
        //System.out.println("Length is:" +length);
        System.out.println("Length of the string: " +str.length());
        // Convert to uppercase
        System.out.println("Uppercase String: " +str.toUpperCase());
        //Convert to lowercase
        System.out.println("Lowercase String: " +str.toLowerCase());
        // Check if the String startsWithHello
        System.out.println("Start With Hello: " +str.startsWith("Hello"));
        //check if the string endsWithWorld
        System.out.println("Ends With World: " +str.endsWith("World"));
        // Trim leading and trailing whitespace -- it removes any whitespace characters at the
        //beginning of the string and as well as remove white space at the ned of the string and
        // return a new string. e.g. " Hello, World!"; it will return "Hello, World!"
        System.out.println("Trimmed String: " +str.trim());
        // Replace "Hello" with "Hi"
        System.out.println("Replaced String: " +str.replace("Hello", "Hi"));
        // Get substring from index 7 to 12 (exclusive)
        System.out.println("Substring: " +str.substring(7, 12));
        //check if the string contains "World"
        System.out.println("Contains World: " +str.contains("World"));

        String sentence= "Hello World! How are you";
        String [] words= sentence.split(" ");
        for(String word: words){
            System.out.println(word);
        }
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);


//        String str1= "Hellooooo";
//        String str2=str1;
//        System.out.println(str2 +"," + str1);
//        str1= str+"Wold";
//        System.out.println(str1);
//        System.out.println(str2);
//        String str3= "Abhi";
//        str3.concat("Jit"); -- here we cant directly change the str3 value that's why its immutable
//        System.out.println(str3);
//        String modifier= str3.concat("jeet"); -- by using third party variable we can change the value.
//        System.out.println(modifier);

    }
}
