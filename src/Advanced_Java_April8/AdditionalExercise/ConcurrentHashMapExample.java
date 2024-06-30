package Advanced_Java_April8.AdditionalExercise;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        Thread thread1 = new Thread(new Task(map, Operation.PUT, 4, "Four"));
        Thread thread2 = new Thread(new Task(map, Operation.GET, 2, null));
        Thread thread3 = new Thread(new Task(map, Operation.REMOVE, 3, null));
        thread1.start();
        thread2.start();
        thread3.start();

    }

    enum Operation {
        PUT, GET, REMOVE
    }

    static class Task implements Runnable {
        ConcurrentHashMap<Integer, String> map;
        Operation operation;
        Integer key;
        String value;

        public Task(ConcurrentHashMap<Integer, String> map, Operation operation,
                    Integer Key, String Value) {
            this.map = map;
            this.operation = operation;
            this.key = key;
            this.value = value;

        }

        public void run() {
            synchronized (map) {
                switch (operation) {
                    case PUT:
                        if (value != null) {
                            map.put(key, value);
                            System.out.println("Thread" + Thread.currentThread().getName() + "put element:" + key + "->" + value);
                        } else {
                            System.out.println("Thread " + Thread.currentThread().getName() + "received null value for put operation.");
                        }

                        System.out.println("Thread" + Thread.currentThread().getName() + "put element: " + key + "->" + value);

                        break;
                    case GET:
                        String retrievedValue = map.get(key);
                        if (retrievedValue != null) {
                            System.out.println("Thread " + Thread.currentThread().getName() + "->" + retrievedValue);
                        } else {
                            System.out.println("Thread " + Thread.currentThread().getName() + "could not retrieved element with key: " + key + ", its null");
                        }


                        System.out.println("Thread" + Thread.currentThread().getName() + "retrieved element: " + key + "->" + retrievedValue);
                        break;
                    case REMOVE:
                        String removedValue = map.remove(key);
                        if (removedValue != null) {
                            System.out.println("Thread " + Thread.currentThread().getName() + "remove element :" + key + "->" + removedValue);

                        } else {
                            System.out.println("Thread " + Thread.currentThread().getName() + "could not remove element with key: " + key + ", its null");
                        }
                        System.out.println("Thread " + Thread.currentThread().getName() + " removed element: " + key + "->" + removedValue);
                        break;
                }
                System.out.println("Map contents after operation: " + map);
            }
        }
    }
}
