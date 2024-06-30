package First_Program.Variable;

public class Variable_1 {
    public static void main(String[] args) {
        int myNumber=865;
        System.out.println(myNumber);
        //Declaring variable in different way:
        int yourNumber;
        yourNumber=765;
        System.out.println(yourNumber);
        //assigning value in same variable:
        yourNumber= 22;
        System.out.println(yourNumber);
        //assigning boolean value to the variable:
        boolean isVegetarian = true;
        System.out.println(isVegetarian);
        //defining the floating numbers:
        float myFloat= 5.0f;
        System.out.println(myFloat);
        //why its still print..5.0 as output because we already define the type of data,(float)
        float myFloatt= 5;
        System.out.println(myFloatt);
        //Declaring String data type:
        String wishes = "Good Morning";
        System.out.println(wishes);
        //Declaring Char data types:
        char myCharacter='K';
        System.out.println(myCharacter);

        int a=5;
        int b=9;
        System.out.println("The value of a is :" + a  + " \nand The value of b is:" + b);


    }

}
