package Advanced_Java_April8.Exercise;

public class SquareAndCube {
//    static int number= 3;
        public static void main(String[] args) {
            int number = 3;
            System.out.printf("%d - %d - %d", number, sqr(number), cube(number));
        }

        public static int sqr(int number){
            return number*number;
        }
        public static int cube(int number){
            return number*number*number;
        }
    }

 // Another approach of solving the problem without using any return type means here we have used void.

 class Solutio {
    public static void main(String[] args) {
        int number = 3;
        System.out.println(number);
        sqr(number);
        cube(number);

    }

    public static void sqr(int number){
        System.out.println(number*number);
    }
    public static void cube(int number){
        System.out.println(number*number*number);
    }
}

