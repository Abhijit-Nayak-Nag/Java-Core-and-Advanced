package ReflectionAPI;
import java.lang.reflect.*;
public class ClassInfo {
    public static void main(String[] args) {
        try{
            java.util.Scanner scanner= new java.util.Scanner(System.in);
            System.out.println("Enter fully qualified class name: ");
            String className= scanner.nextLine();
            Class<?> clazz= Class.forName(className);
            System.out.println("\nClass Information: ");
            System.out.println("Superclass Name: " + clazz.getSuperclass().getName());
            System.out.println("Implemented Interfaces: " + java.util.Arrays.toString(clazz.getInterfaces()));

        }catch(ClassNotFoundException e ){
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
