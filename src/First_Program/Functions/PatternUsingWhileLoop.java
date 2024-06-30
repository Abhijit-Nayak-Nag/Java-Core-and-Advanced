package First_Program.Functions;

public class PatternUsingWhileLoop {
    public static void main(String[] args) {
        pattern();

    }

    public static void pattern() {
        int rows = 0;
        while (rows < 5) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;

        }
    }
}

//*
//* *
//* * *
//* * * *
//* * * * *