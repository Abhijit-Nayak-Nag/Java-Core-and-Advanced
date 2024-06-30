package implementaionstackusingqueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
    // Java program to implement a stack using Deque
        // Create an empty deque
        Deque<Integer> myDeque = new LinkedList<>();


        void push(int item) {
            // Append the item to the end of the deque
            myDeque.addLast(item);
        }

        int pop() {
            // Remove and return the item from the end of the deque
            int item = myDeque.getLast();
            myDeque.removeLast();
            return item;
        }

        int size() {
            // Return size of deque
            return myDeque.size();
        }

        boolean isEmpty() {
            // Return true if the deque is empty, and false otherwise
            return myDeque.isEmpty();
        }

        int top() {
            if (isEmpty()) {
                // If the stack is empty, return -1
                return -1;
            }
            else {
                // Return the last item in the deque
                return myDeque.getLast();
            }
        }

    @Override
    public String toString() {
        return "StackQueue{" +
                "myDeque=" + myDeque +
                '}';
    }
}

    class GFG {
        public static void main(String[] args) {
            StackQueue st = new StackQueue();

            StackQueue st1 = new StackQueue();


            st.push(1);
            st.push(2);
            st.push(3);
            System.out.println("current size: " + st.size());
            System.out.println(st.top());
            st.pop();
            System.out.println(st.top());
            st.pop();
            System.out.println(st.top());
            System.out.println("current size: " + st.size());
            System.out.println(st.myDeque);
            System.out.println(st.myDeque.size());


            st1.myDeque.add(333);
            System.out.println(st1);
            System.out.println(st1.isEmpty());
            System.out.println(st1.top());
            System.out.println(st1.myDeque.remove());
            System.out.println(st1);

        }
    }
