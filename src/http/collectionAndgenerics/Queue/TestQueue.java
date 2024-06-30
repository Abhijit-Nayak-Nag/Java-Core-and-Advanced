package http.collectionAndgenerics.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer>queue= new LinkedList<>();
        queue.add(1);
        queue.offer(2);

        for (Integer i : queue) {
            System.out.println( i);

        }
        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

    }
}
