package Day_3;
import java.util.HashMap;
import java.util.Map;
public class FlyweightStringFactory {
    private static final Map<String, String>stringPool = new HashMap<>();
    public static String getString(String value){
        String stringFromPool= stringPool.get(value);
        if (stringFromPool == null){
            stringFromPool = new String(value);
            stringPool.put(value,stringFromPool);
        }
        return stringFromPool;
    }
    public static void printStringPool(){
        System.out.println("String Pool:");
        for (String key : stringPool.keySet()){;
    }

  }
public static void main(String[] args) {
    String s1 = FlyweightStringFactory.getString("Helo");
    String s2 = FlyweightStringFactory.getString("Hello");
    String s3 = FlyweightStringFactory.getString("Hello");

    System.out.println("s1 == s3: " + (s1 == s3));
    System.out.println("s1 == s2:" + (s1 == s2));
    System.out.println("s2 == s3:" + (s2== s3));
    FlyweightStringFactory.printStringPool();
    }

}
