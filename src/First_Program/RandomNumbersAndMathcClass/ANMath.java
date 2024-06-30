package First_Program.RandomNumbersAndMathcClass;

public class ANMath {
    public static void main(String[] args) {
        System.out.println(Math.abs(-99));
        System.out.println(Math.ceil(5.07));
        System.out.println(Math.floor(5.07));
        System.out.println(Math.round(5.07));
        System.out.println(Math.round(5.57));
        // random() it will generate a random number every time you will run the code
        // it generates random number between 0-1 the number would be any decimal number.
        System.out.println(Math.random());

        // if you want to generate 10 random numbers, but it will generate on floating point
        // between 0-1 if you want to generate in integer between 1-100 you can type cast
        // it and do it.
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());

        }

    }
}
