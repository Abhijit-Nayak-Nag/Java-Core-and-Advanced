package First_Program.Functions;

import Day_2.Main;

public class ParameterizedMethod {
    public static void main(String[] args) {

        ParameterizedMethod par= new ParameterizedMethod();
        par.greet("John");

    }
    public void greet(String name) {
        System.out.println("Hello," + name);
    }
}
