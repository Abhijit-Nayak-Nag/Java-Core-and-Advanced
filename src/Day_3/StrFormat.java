package Day_3;

public class StrFormat {
    public static void main(String[] args) {
        String name ="john";
        int age = 30;
        double height =5.8;
        String formattedString =String.format("Name: %s, Age: %d, Height: %.2f feet" , name, age, height);
        System.out.println(formattedString);
        int number = 1234567890;
        String paddedNumber =String.format("%d", number);
        System.out.println("Formatted Number with commas:" +paddedNumber);
        double decimalNumber = 123.456;
        String formatteddecimal = String.format("%.2f", decimalNumber);
        System.out.println("Formatted Decimal Number: " + formatteddecimal);
        int paddedInt =123;
        String paddedIntString=String.format("%05d",paddedInt);
        System.out.println("Padded Number with Leading Zeros: " +paddedIntString);
        double largeNumber = 1234567.890123;
        String combinedFormat = String.format("Large Number with commas and precision: %, .2f", largeNumber);
        System.out.println("CombinedFormat");

    }
}
