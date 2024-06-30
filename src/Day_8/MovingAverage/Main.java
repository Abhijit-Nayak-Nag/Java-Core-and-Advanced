package Day_8.MovingAverage;

public class Main {
        public static void main(String[] args) {
            MovingAverage obj=new MovingAverage(3);
            System.out.println(obj.next(1));
            System.out.println(obj.next(10));
            System.out.println(obj.next(3));
            System.out.println(obj.next(5));
        }

    }
