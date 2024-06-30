package Day_3;
public class StringMethodsDemo {
    public static void main (String[] args) {
        String str = "Hello,World";
        int length = str.length();
        System.out.println("Length of the string :" + length);
        char firstChar = str.charAt(0);
        String substring = str.substring(7);
        System.out.println("Substring from index 7: " + substring);
        int IndexOfComma = str.indexOf(" ,");
        System.out.println("Index of Comma :" + IndexOfComma);
        int lastIndexOfSpace = str.lastIndexOf(" ");
        System.out.println("Last index of space : " + lastIndexOfSpace);
        String str2 = "Hello, World!";
        boolean isEqual = str.equals(str2);
        System.out.println("Are the strings eual? "+isEqual);
        String str3 = "Hello, World!";
        boolean isEqualIgnoreCase = str.equalsIgnoreCase(str3);
        System.out.println("Are the strings equal ignoring case? " + isEqualIgnoreCase);
        int compareToResult = str.compareTo(str2);
        System.out.println("Compare to result :" + compareToResult);
        int compareToIgnoreCaseResult =  str.compareToIgnoreCase(str3);
        System.out.println("Compare to ignore case result :" + compareToResult);
        String replaceString = str.replace("World", "Universe");
        System.out.println("String after replacement: " + replaceString);
        String strWithspace = "Hello, World!";
        String trimemdstring = strWithspace.trim();
        String lowerCaseString = str.toLowerCase();
        System.out.println("Lower case string: " + lowerCaseString);
        String UppercaseString = str.toUpperCase();
        System.out.println("Upper case string :" + UppercaseString);
        String[] splitString = str.split(",");
        System.out.println("Split string :");
        for (String s : splitString) {
            System.out.println(s.trim());
        }


    }
}
