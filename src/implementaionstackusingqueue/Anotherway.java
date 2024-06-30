package implementaionstackusingqueue;

import java.util.LinkedList;
import java.util.Queue;

 class Anotherway {
    Queue<Integer>queue= new LinkedList<>();

    void push(int item){
        queue.add(item);
//  System.out.println(queue.add(item));
//  if you write like this then you don't need to write sout statement in your main method for printing this push method you can directly call the method and it will print.
    }

     @Override
     public String toString() {
         return "Anotherway{" +
                 "queue=" + queue +
                 '}';
     }
 }

class Qu{
    public static void main(String[] args) {
        Anotherway way= new Anotherway();
        way.push(999);
        System.out.println(way.queue);
        System.out.println(way);
        way.queue.add(222);

        System.out.println(way.queue);
        System.out.println(way.queue.size());
        System.out.println(way.queue.isEmpty());
    }
}
