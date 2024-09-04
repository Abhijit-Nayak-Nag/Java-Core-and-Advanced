package Advanced_Java.MultiThreading;


public class Format {
    public static void main(String[] args) {
        String name ="Abhijit";
        int age= 23;

        System.out.printf("%d,%s",age, name +"\n");
        System.out.println("\nthis is another way of doing the formatting in the newline : ");
        String forMatting= String.format("%d,%s", age, name);
        System.out.println(forMatting);


    }
}