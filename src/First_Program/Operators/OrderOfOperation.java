package First_Program.Operators;

public class OrderOfOperation {
    public static void main(String[] args) {
        //Remember what ever operation you are performing they should follow "BODMAS" rule.
        //B- Braces, O-Order, D- Division, M- Multiplication, A- Addition, S- Subtraction.
        //Here first multiplication will perform then after subtraction will perform.
        System.out.println(8-3*3);
        // if operators are same then we have to follow left to right---->
        System.out.println(9/3/3 +"\n");
        //if we put a bracket between 3 and 3 then it works fast then division operator works later on.
        System.out.println(9/(3/3));

    }
}
