package Classes_Objects.InstanceVarAndMethods;

public class Bike {
    String name;
    String model;
    int price;

    void start() {
        System.out.println("Bike is Starting.........");
    }

    void stop() {
        System.out.println("Bike is stopping........");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}

    class main {
        public static void main(String[] args) {
            Bike bike1 = new Bike();
            Bike bike2 = new Bike();

            bike1.name = "Hero";
            bike1.model = "Passion plus";
            bike1.price = 50000;
            System.out.println(bike1);

            bike2.name = "Honda";
            bike2.model = "Shine";
            bike2.price = 80000;
            System.out.println(bike2);

            bike1.start();
            bike1.stop();

            bike2.start();
            bike2.stop();

        }

    }

