package Advanced_Java.MultiThreading;


public class ClassA {
    public String name;

    private int agee;
    //    -- it is not acceptable in another method until you make it as global variable.
    private static int age;

    public static void main(String[] args) {
        ClassA a = new ClassA();
        System.out.println(a.name = "RAHUL");
        a.name = "ABHIJIT";
        System.out.println(a.name);
        System.out.println(a.getClass());
        System.out.println(a.toString());
        System.out.println(a);
        System.out.println(a.name + "," + a.name);
        System.out.println(a.age);
        age=33; //declaring the value of the variable age.
        accept();





    }

    public static void accept() {
        System.out.println(age);
    }

    public void access() {
        // Accessing instance variable with this for clarity
        System.out.println(this.agee);
    }

    public static void printAge(ClassA aa) {
        System.out.println(aa.agee);
    }

    public void access2() {
        // Accessing instance variable directly
        System.out.println(agee);
    }

    public void access3() {
        // Accessing static variable using this keyword (not recommended) -- ide will show some warning.
        System.out.println("Static Age using this: " + this.age);

        // Preferred way to access static variable
        System.out.println("Static Age using class name: " + ClassA.age);
    }
}

//   public static void accept3(){
//        System.out.println(this.age);
//    }

/*
 you cannot access a static variable using the "this" keyword in a static method.
 The "this" keyword refers to the current instance of the class, but static methods do not belong to
 any instance; they belong to the class itself. Therefore, using this in a static context will result
 in a compilation error.
*/