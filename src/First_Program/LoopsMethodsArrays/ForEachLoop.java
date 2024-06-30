package First_Program.LoopsMethodsArrays;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] array = new String[]{
                "Ram", "Shyam", "Sita", "Geeta"
        };

//        printArray(array); -- method calling for loop.
        printArrayForEach(array);
    }

    // Iterating array using forEach loop:
    public static void printArrayForEach(String[] array) {
        for (String name : array) {
            System.out.println(name);
        }
    }
}

// Iterating array using for loop:
//    public static void printArray(String[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//    }


