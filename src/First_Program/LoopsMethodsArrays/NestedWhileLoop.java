package First_Program.LoopsMethodsArrays;

public class NestedWhileLoop {
    public static void main(String[] args) {
        int i =1;
        while(i<=4){
            System.out.println("Hello " +i);
            int j=1;
            while(j<=3){
                System.out.println("Hii " +j);
                j++;
            }
            i++;
        }

    }

}
//here in this program we used nested while loop;  and here in inner while loop
// we are printing Hello once and Hii three times then hello once and hii 3 times and so on.