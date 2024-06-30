package Classes_Objects.InstanceVarAndMethods;

public class Driverr {
    public static void main(String[] args) {
        Carr swift = new Carr();

        //this is default constructor value i.e. assign by jvm by default in your class.
//        swift.addFuel(6);
//        swift.start();
//        swift.drive();
//        System.out.println(swift.getCurrentFuelLevel());

        //after creating the constructor....
        swift.drive();
        System.out.println(swift.colors);
        System.out.println(swift.maxSpeed);
    }

}

