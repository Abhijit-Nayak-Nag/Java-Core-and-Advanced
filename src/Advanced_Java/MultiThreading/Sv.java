package Advanced_Java.MultiThreading;

public class Sv extends St {
    public Sv(int age, String name, int salary) {
        super(age, name, salary);
    }

    public static void main(String[] args) {

        Sv sv= new Sv(22,"Abhi",8900);
        System.out.println(sv);

   //here we have not created separate object we just update the value of the first object.
    // if you want to create the separate object you can create.
    // ex: Sv sv1 = new Sv(); if you do like this then you have to assign the value using getter setter  only because you are referring to default constructor.
    // if you want to pass the value you can pass else ypu can skip because we have initialize default constructor as well in our parent class.
        sv.setName("Himanshu");
        sv.setAge(22);
        System.out.println(sv);
        System.out.println("Age: " +sv.getAge());
        System.out.println("Name: " + sv.getName());


        int sal= sv.salary=3333;
        System.out.println("salary: " + sal);

        System.out.println(sv.salary=3333);


        sv.salary= 3333;
        System.out.println("Salary: " + sv.salary);

        System.out.println("Salary: " +sv.getSalary());



        sv.heyMethod("Abhi");
        St.hello("Abhijit Nayak");

        System.out.println("\nHere is 'age()' method is running:");
        sv.agee();
    }
}
