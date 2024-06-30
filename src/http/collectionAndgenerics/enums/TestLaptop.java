package http.collectionAndgenerics.enums;

public class TestLaptop {
    public static void main(String[] args) {
        Laptop lap= Laptop.MACBOOOK;
        System.out.println(lap);

        System.out.println(lap + ":" + lap.getPrice() + "\n");


        // using for-each loop we can print all the price of all the laptop

        System.out.println("Iterating using for-each loop");

        for(Laptop ll: Laptop.values()){
            System.out.println(ll + ":" + lap.getPrice());
        }
    }
}
