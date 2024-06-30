package ReflectionAPI;
import java.lang.reflect.*;
public class Calculator {
    public int add(int a, int b){
        return a +b;
    }

}
 class DynamicMethodInvocation{
    public static void main(String[] args) {
        try{
            Class<?> clazz = Calculator.class;
            Method method = clazz.getMethod("add", int.class, int.class);
            Object calculator = clazz.getDeclaredConstructor().newInstance();
            int result = (int) method.invoke(calculator, 5,3);
            System.out.println("\nInvoking method dynamically");
            System.out.println("Result of add(5,3): " + result);
        }catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e){
            System.out.println("Error :" + e.getMessage());
        }
    }
}