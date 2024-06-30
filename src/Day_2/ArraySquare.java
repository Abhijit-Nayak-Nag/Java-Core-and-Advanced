package Day_2;

public class ArraySquare {
    public static Integer[] squareArray(Integer[] inputArray) {
        Integer[] resultArray = new Integer[inputArray.length]; // Creating a new array to store the squared values with the same length as the input array
        int index = 0; // Initializing an index variable to keep track of the current position in the arrays

        for (Integer num : inputArray) { // Iterating over each element in the input array using a for-each loop
            resultArray[index] = num * num; // Squaring the current element and storing it in the corresponding position in the result array
            index++; // Incrementing the index to move to the next position in the arrays
        }

        return resultArray; // Returning the result array with squared values
    }

    public static void main(String[] args) {
        Integer[] inputArray = {1, 2, 3, 4, 5}; // Example input array

        Integer[] squaredArray = squareArray(inputArray); // Calling the squareArray method to get the squared array

        // Printing the squared array
        System.out.println("Squared Array:");
        for (Integer num : squaredArray) {
            System.out.print(num + " ");
        }
    }
}

