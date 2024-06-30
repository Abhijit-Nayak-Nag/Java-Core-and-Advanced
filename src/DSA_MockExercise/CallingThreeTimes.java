package DSA_MockExercise;

public class CallingThreeTimes {
        private static int count = 0;
        private static final int MAX_CALLS = 3;

        public static void main(String[] args) {
            if (count < MAX_CALLS) {
                count++;
                System.out.println("Call number: " + count);

                main(args); // Recursive call to main method
            }
        }
    }

 //The line main(args); in a Java program is a call to the main method itself. This is an example of
// recursion where the main method calls itself with the same arguments.


/*
How Recursion Unfolds
First Call: count = 0, count < MAX_CALLS is true, count becomes 1, prints "Call number: 1", calls main(args).
Second Call: count = 1, count < MAX_CALLS is true, count becomes 2, prints "Call number: 2", calls main(args).
Third Call: count = 2, count < MAX_CALLS is true, count becomes 3, prints "Call number: 3", calls main(args).
Fourth Call: count = 3, count < MAX_CALLS is false, the recursion stops, and the method returns.
 */

