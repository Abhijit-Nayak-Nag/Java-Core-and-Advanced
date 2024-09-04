package Advanced_Java.MultiThreading;

    public interface Vehicle {
    // Define an interface with a default method
        // Abstract method
        void start();
        // Default method
        default void stop() {
            System.out.println("Vehicle is stopping");
        }
    }

    // Implementing the Vehicle interface in a Car class
    class Car implements Vehicle {
        @Override
        public void start() {
            System.out.println("Car is starting");
        }

        // Optionally, the Car class can override the default method
        @Override
        public void stop() {
            System.out.println("Car is stopping with brake assist");
        }
    }

    // Implementing the Vehicle interface in a Bike class
    class Bike implements Vehicle {
        @Override
        public void start() {
            System.out.println("Bike is starting");
        }

        // Bike class uses the default stop method from the Vehicle interface
    }

        class DefaultMethodDemo {
        public static void main(String[] args) {
            Vehicle car = new Car();
            car.start();
            car.stop();

            Car car1= new Car();
            car.start();


            Vehicle bike = new Bike();
            bike.start();
            bike.stop();
        }
    }
