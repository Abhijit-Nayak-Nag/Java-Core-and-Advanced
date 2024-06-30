package First_Program.Functions;

public class PatternUsingFunction {
    public static void main(String[] args) {
        printFirstPattern();
        printSecondPattern();
        printThirdPattern();

    }
    public static void printThirdPattern(){
        //Printing Left Half Pyramid using one printing statement and escape character.
        System.out.println("     *\n   * *\n * * *\n* * * *\n* * * * *\n");
    }
    public static void printSecondPattern(){
        //Printing Reverse Right Half Pyramid using one printing statement and escape character.
        System.out.println("* * * * * \n* * * * \n* * * \n* * \n*\n");
    }
    public static void printFirstPattern(){
        //Printing Right Half Pyramid using one printing statement and escape character.
        System.out.println("* \n* * \n* * * \n* * * * \n* * * * *\n");

    }

}
