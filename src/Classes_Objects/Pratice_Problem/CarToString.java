package Classes_Objects.Pratice_Problem;

public class CarToString {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelName;
    String company;

    public CarToString(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelName, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelName = modelName;
        this.company = company;
    }

//    @Override
//    public String toString() {
//        return "My car name is :" +name;
//    }


    @Override
    public String toString() {
        return "CarToString{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelName='" + modelName + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        CarToString swift=  new CarToString(4, 4,120,"Swift" ,
                "Sw876", "Maruti");
        System.out.println(swift.toString());
        System.out.println(swift);

//alternative way of toStringMethod direct print of your object, and it will give all the customize representation.
// if you are not used twoString Method and you are printing the object then you will get hashcode
// if you want to print the object value then you need to print individual properties.
//         System.out.println(swift.maxSpeed);

    }
}
