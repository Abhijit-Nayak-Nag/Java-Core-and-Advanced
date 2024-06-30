package Day_2;

abstract class Vechile {
    int speed;
    public abstract void speedUp();
}
class Car extends Vechile{
    public Car(){
        speed =0;
    }
    public void speedUp(){
        speed+=10;
    }
}
class Bike extends Vechile{
    public Bike(){
        speed =0;
    }
    public void speedUp(){
        speed +=5;
    }
}
public class Main{
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        car.speedUp();
        System.out.println("Car speed after speeding up: " +car.speed);
        bike.speedUp();
        System.out.println("Bike speed after speeding up:" +bike.speed);
    }
}
