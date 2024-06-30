package DSA_MockExercise;

public class Man extends Person{
    public Man(int age, String name) {
        super(age, name);
    }
    public static void main(String[] args) {
        Man man= new Man(22,"Rahul");
//       man.setName("abhi");
        System.out.println(man.getName());
        System.out.println(man.age);
    }




}
