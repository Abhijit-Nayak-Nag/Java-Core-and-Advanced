package Classes_Objects.InstanceVarAndMethods;

 public class Carr {
    /*
     --defining the properties/Attributes of the class car...
      and these variables are called instance variables for class car or instance properties
      for class car.
       */
    int noOfWheels;
    String colors;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    /* declaring Methods for the class car...
     */


    // This drive() methods will return nothing that's why we made it as void.
    //use "this" keyword in code......

    /* Declaring constructor in our class... you can change the value, but initially
    we want these value by default in our object. constructor name should same as
    your class name.
    */

    Carr(){
        noOfWheels=4;
        colors="Black";
        maxSpeed=150;
        currentFuelInLiters=2;
        noOfSeats=5;

    }


//    Carr(String colors, Float maxSpeed ){
//        noOfWheels=4;
//        this.colors=colors;
//        this.maxSpeed=maxSpeed;
//        currentFuelInLiters=2;
//        noOfSeats=5;
// }

// if you passed two parameter inside your constructor then passed two argument
// while creating a new object follows by the constructor values.
// Carr swift = new Carr(color: "Red", maxSpeed: 200);



    //parameterized constructor.

//    Carr(String color){ ---this color is an argument/parameter
//       noOfWheels=4;
//       this.color=color; ------this color is an argument while this.color is a variable
//       maxSpeed=150;
//       currentFuelInLiters=2;
//       noOfSeats=5;
//     }
//   if you initialize the constructor like above then give the argument while
//   creating the new object e.x : Carr swift = new Carr(color:"Red");
//   if you just write like this while creating a new object Carr swift = new Carr();
// it throws you an error. it means we have restricted while creating a new object
// you have to give the constructor color otherwise your new object not gonna created yet.

    public Carr start() {
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel, can't start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode, please refuel");
        } else {
            System.out.println("Car is Started.....Bruhhhhhhhhh");
        }
        return this;
    }
    public void drive(){
            currentFuelInLiters--;
            System.out.println("Car is driving.....");
        }
    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters += currentFuelInLiters;
    }
    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }

}