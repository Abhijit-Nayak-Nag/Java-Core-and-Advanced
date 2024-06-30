package Advanced_Java_April8.Exercise;

public class Human {
        String name;
        char sex;
        int money;
        int weight;
        double size;


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", money=" + money +
                ", weight=" + weight +
                ", size=" + size +
                '}';
    }

    public void initialize(String name, int money, char sex, int weight, double size) {
            this.name = name;
            this.money = money;
            this.sex = sex;
            this.weight= weight;
            this.size=size;
//            System.out.println(name);
   }

    public String toString(String refName) {
        return refName + ": " + this.toString();
    }




        public static void main(String[] args) {
            Human human= new Human();
            human.initialize("Abhijit", 30000, 'M', 57, 37.4);
            System.out.println(human);

            Human human1= new Human();
            human1.money=44000;
            human1.name="Rahul";
            human1.sex='M';
            human1.weight=55;
            human1.size=43.4;
            System.out.println(human1);

            //System.out.println(human1.sex='F');
            System.out.println(human1.toString("human1"));

     }


 }



