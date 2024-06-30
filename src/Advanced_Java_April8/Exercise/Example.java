package Advanced_Java_April8.Exercise;

public class Example {
        public void exampleMethod() {
            int[] array = new int[10];
            // Accessing the local array
            array[0] = 1;
            System.out.println(array[0]);
        }

        public static void main(String[] args) {
            Example example = new Example();
            example.exampleMethod();
        }
    }
