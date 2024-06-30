package First_Program.Functions;

public class Parameter {
    public static void main(String[] args) {
        int num=sumTwoNumbers(4,7);
        System.out.println("result: " +num);
        //You can directly call the function: sumTwoNumbers(2,5);
        // or you can write sout(sumTwoNumber(4,7)); by omitting all the above 3 lines.


    }
    public static int sumTwoNumbers(int first, int second){
        System.out.println("First number received: " +first);
        System.out.println("Second number received: " +second);
        int sum=first +second;
        // if you are writing this statement- System.out.println("result is: " +sum);
        //then you can just go to the main method and pass the argument inside your SumTwoNumbers methods no need to create variable.
        return sum;
        //return first+second;
    }

}
