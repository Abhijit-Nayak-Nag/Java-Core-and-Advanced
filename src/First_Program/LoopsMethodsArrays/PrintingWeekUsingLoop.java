package First_Program.LoopsMethodsArrays;

public class PrintingWeekUsingLoop {
    public static void main(String[] args) {
        int i=1;
        while(i<=4){
            System.out.println("Month : " +"Week: " +i);

            int j=1;
            while (j<=7){
                System.out.println("Day: " +j);
                j++;
            }
            i++;
        }
    }
}
