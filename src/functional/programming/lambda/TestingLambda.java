package functional.programming.lambda;

import java.util.Scanner;

@FunctionalInterface
public interface TestingLambda {
//    void call();
//    }
     void call(int no);
}

    //if you are not used lambda expression we need to write this much of code manually.
//    class Lambda implements TestingLambda {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter your number: ");
//            int input = sc.nextInt();
//            Lambda lam = new Lambda();
//            lam.call(input);
//        }
//
//        @Override
//        public void call(int no) {
//            System.out.println("Calling: " + no);
//        }


//            Lambda lam= new Lambda();
//            lam.call(22);
//            }
//        @Override
//        public void call(int no) {
//            System.out.println("Calling: " +no);
//        }
//
//    }

        class LambdaDemo {
            public static void main(String[] args) {
//          Lambda lam= new Lambda();
//          lam.call();
//
//          TestingLambda lambda= new Lambda();
//          lambda.call();
//
//          TestingLambda la= new TestingLambda() {
//              @Override
//              public void call() {
//                  System.out.println("Calling");
//              }
//          };
//          lambda.call();


//            TestingLambda lambda= (no)-> System.out.println("Calling: " +no);
//            lambda.call(44);
                TestingLambda lambda = (int no) -> System.out.println("Calling: " + no);
                lambda.call(44);
            }
        }
