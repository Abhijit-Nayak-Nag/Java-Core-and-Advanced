package First_Program.If_Else;

public class ElseIfLadder {
    public static void main(String[] args) {
        boolean isSeniorCitizen = false;
        boolean isAnAdult = true;
        if (isSeniorCitizen) {
            System.out.println("Hello Senior Citizen");
        } else if (isAnAdult) {
            System.out.println("Hello Adult");
            System.out.println("else if ladder will work ");
        } else {
            System.out.println("Hello Child");
        }

    }
}
