package Advanced_Java_April8.Exercise;


import java.util.LinkedList;
import java.util.Queue;

public class StackQueue {
        Queue<Integer> queue = new LinkedList<>();

        int push(int item) {
            queue.add(item);
            return item;
        }
//    void push(int item) {
//        queue.add(item);
//    }

    @Override
    public String toString() {
        return "StackQueue{" +
                "queue=" + queue +
                '}';
    }

    public static void main(String[] args) {
            StackQueue st1 = new StackQueue(); // Create instance of StackQueue
            st1.push(33); // Use the push method to add an item to the queue
            System.out.println(st1.queue); // Print the contents of the queue
            int  ele= st1.push(32);
           System.out.println(st1.queue);
           st1.push(333);
            System.out.println(st1); // Print the instance of StackQueue
        }
    }

