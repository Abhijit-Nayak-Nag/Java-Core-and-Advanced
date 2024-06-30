package ReflectionAPI;
import java.lang.reflect.*;
public class DynamicClassCreation {
    public static void main(String[] args) {
        String className= "java.util.Date";
        Object instance= createInstance(className);
        if(instance !=null){
            System.out.println("Instance created");
        }
    }
    public static Object createInstance(String className){
        try{
            Class<?> clazz = Class.forName(className);
            Object instance = clazz.newInstance();
            return instance;
        }catch (ClassNotFoundException e){
            System.out.println("Class not found :" + e.getMessage());
        }catch(IllegalAccessException e){
            System.out.println("Illegal access exception: " + e.getMessage());
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
