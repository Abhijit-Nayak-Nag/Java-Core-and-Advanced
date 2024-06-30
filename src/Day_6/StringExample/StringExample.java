package Day_6.StringExample;

public class StringExample {
    public static void main(String[]args){
        //Create a String
        String str = "Hello, World!";
        //Get the length of the string
        int length = str.length();
        System.out.println("Length of the string :" +length);
        //Get a substring
        String substring = str.substring(7);
        System.out.println("Substring from index 7: " +substring);
        //concatenate strings
        String newstr= str.concat("Goodbye!");
        System.out.println("Concatenated string :" +newstr);
        //Convert the string uppercase
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase string :" +upperCaseStr);
        //Convert the string to lowercase
        String lowerCase =str.toLowerCase();
        System.out.println("Lowercase string :" +lowerCase);
        //Check if the string contains a substring
        boolean contains =str.contains("World");
        System.out.println("Does the string contain 'World'?: " +contains);
        // Replace character in the string
        String replacedStr= str.replace('o','x');
        System.out.println("String after replacing 'o' with 'x' :" +replacedStr);
        //Split the string into an array of substrings
        String [] parts=str.split(" , ");
        System.out.println("Split string: ");
        for (String part: parts){
            System.out.println(part.trim());
        }
        //Trim leading and trailing whitespace
        String trimmedStr= " Trimmed String ".trim();
        System.out.println("Trimmed string :" +trimmedStr);


    }
}
