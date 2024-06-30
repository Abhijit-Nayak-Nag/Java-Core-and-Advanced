package Day_1;
//import java.util.*;
public class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        System.out.println("Area:" + rectangle.calculateArea());
        System.out.println("Perimeter:" + rectangle.calculatePerimeter());
    }
}