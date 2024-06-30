package ReflectionAPI;

import java.lang.reflect.Constructor;

public class ReflectionExample {
        public static void main(String[] args) {
            Class<?> employeeClass = Employee.class;
            Constructor<?>[] constructors= employeeClass.getConstructors();
            System.out.println("Constructor Information");
            for(Constructor<?> constructor : constructors){
                System.out.println("Constructor Name: " + constructor.getName());
                System.out.println("Parameter Count: " + constructor.getParameterCount());
            }
        }
}
