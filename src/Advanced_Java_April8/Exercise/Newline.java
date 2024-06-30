package Advanced_Java_April8.Exercise;

public class Newline {
    public static void main(String[] args) {
        printIndividualLine();
        System.out.println("printing new line using return statement wit escape sequence");
        System.out.println(print());


        System.out.println(revStr("Geeks"));
    }
    public static void printIndividualLine(){
        System.out.println("printing in new line using escape sequence");//accuracy : 66%
        System.out.println("Geeks\nfor\nGeeks");

        System.out.println("Printing in new line using println");// accuracy : 57%
        System.out.println("Geeks");
        System.out.println("for");
        System.out.println("Geeks");

//        return "Geeks\nfor\nGeeks";

    }
    public static String print(){
        System.out.println("printing in new line using return statement wit escape sequence");// accuracy : 50%
        return "Geeks\nfor\nGeeks";
    }

    public static String revStr(String s){ //Geeks  //rev=rev+s.charAt(i);
        String rev="";
        for (int i=s.length()-1; i>=0;i--){
            rev+=s.charAt(i);

        }
        return rev;
    }
}
