package Day_4;

public class ExceptionProagation {
    public static void main(String[] args) {
        try{
            method1();
        } catch(ArithmeticException e) {
            System.out.println("Caught ArithmeticException in method1 :" + e.getMessage());
        }

    }

    public static void method1() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in method1 :" + e.getMessage());
        }
    }
    public static void method2() {
        int result = 10 / 0;
    }
}
