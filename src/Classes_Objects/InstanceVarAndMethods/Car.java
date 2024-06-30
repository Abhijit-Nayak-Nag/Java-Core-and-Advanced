package Classes_Objects.InstanceVarAndMethods;

public class Car {
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
        public void drive(){
            if(currentFuelInLiters==0){
                System.out.println("Car is out of fuel");
            }else if(currentFuelInLiters < 5){
                System.out.println("Car is in reserved mode, please refuel");
                currentFuelInLiters--;
            }else{
                System.out.println("Car is driving");
                currentFuelInLiters--;
            }
        }
        public void addFuel(float fuel){
            currentFuelInLiters = currentFuelInLiters+fuel;
        }
        public float getCurrentFuelLevel(){
            return currentFuelInLiters;
        }


    }

