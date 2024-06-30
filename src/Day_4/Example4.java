package Day_4;

import java.util.LinkedList;
import java.util.Queue;

public class Example4 {
    public static void main(String[] args) {
        Queue<Character> charQueue = new LinkedList<>();
        charQueue.add('a');
        charQueue.add('b');
        charQueue.add('c');
        charQueue.add('d');
        charQueue.add('e');
        System.out.println("Queue elements: ");
        System.out.println(charQueue);
        char removeElement = charQueue.remove();
        System.out.println("Removed element: " + removeElement);
        System.out.println("Remaining Element in the queue : ");
        System.out.println(charQueue);;

    }
}

