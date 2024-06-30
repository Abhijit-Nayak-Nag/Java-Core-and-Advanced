package Day_8.ReverseFirstKElementsOfQueue;
import java.util.*;

public class ReverseFirstKElementsOfQueue {
    public static void reverseFirstKElements(Queue<Integer>queue,int k){
        if(queue.isEmpty()||k<=0||k> queue.size()){
            return;
        }
        Stack<Integer>stack=new Stack<>();
        for(int i=0; i<k;i++){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.offer((stack.pop()));
        }
        for(int i=0;i< queue.size()-k;i++){
            queue.offer(queue.poll());
        }

    }

    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        int k=3;
        reverseFirstKElements(queue,k);
        while(!queue.isEmpty()){
            System.out.println(queue.poll()+" ");
        }
    }
}
