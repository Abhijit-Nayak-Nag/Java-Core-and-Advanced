package Day_8.MovingAverage;
import java.util.*;
public class MovingAverage {
    private Queue<Integer>queue;
    private int windowSize;
    private int sum;

    public MovingAverage(int size){
        queue=new LinkedList<>();
        windowSize=size;
        sum=0;
    }
    public double next(int val){
        queue.offer(val);
        sum+=val;
        if(queue.size()>windowSize){
            sum-=queue.poll();
        }
        return (double)sum/queue.size();
    }
}

