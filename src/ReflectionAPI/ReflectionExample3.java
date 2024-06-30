package ReflectionAPI;

import java.lang.reflect.Field;

public class ReflectionExample3 {
    public static void main(String[] args) {
        Class<?> studentClass= Student.class;
        Field[] fields= studentClass.getDeclaredFields();
        System.out.println("Fields Information: ");
        for(Field field : fields){
            System.out.println("Field Name: " + field.getName() + ", Type: " + field.getType().getName());
        }
    }
}
