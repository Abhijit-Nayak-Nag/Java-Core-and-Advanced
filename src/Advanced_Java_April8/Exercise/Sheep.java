package Advanced_Java_April8.Exercise;

public class Sheep {
        private static int sheepCount = 0;

        public Sheep() {
            sheepCount++;
        }

    public static int getSheepCount() {
        return sheepCount;
    }

    public static void setSheepCount(int sheepCount) {
        Sheep.sheepCount = sheepCount;
    }


        public static void main(String[] args) {
//            Sheep sheep= new Sheep();
//            sheep.setSheepCount(2);
//            System.out.println(sheep.getSheepCount());
            Sheep sheep1 = new Sheep();
            Sheep sheep2 = new Sheep();
            Sheep sheep3 = new Sheep();
            Sheep sheep4= new Sheep();
            Sheep sheep5= new Sheep();
            System.out.println("Object Created for the Sheep class : " +Sheep.getSheepCount());


            Sheep.setSheepCount(3);
            System.out.println(Sheep.getSheepCount());
            setSheepCount(8);
            System.out.println(getSheepCount());

        }
    }


/*
sheepCount is a static variable that tracks the number of sheep.
The constructor increments sheepCount when a new Sheep instance is created (only in Version 1).
getSheepCount returns the current value of sheepCount.
setSheepCount sets the value of sheepCount
  */
