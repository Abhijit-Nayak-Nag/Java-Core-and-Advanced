package Classes_Objects.StringClass;

public class Concat {
    public static void main(String[] args) {
        String myStr= "Hello";
        String mystr2= "World";
        System.out.println(concatination(myStr, " " +mystr2));
        System.out.println(myStr.concat(mystr2));
    }
    public static String concatination(String str1, String str2){
        return str1.concat(str2);
    }
}
