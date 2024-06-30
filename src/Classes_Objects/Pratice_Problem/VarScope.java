package Classes_Objects.Pratice_Problem;

public class VarScope {
    //instance variable
//    int age=60;
    int age;
    //global variable
    static String name= "Abhi";
//    public int birth;
    public static void method(){
        //local variable --- this variable can only accessible with in the method not outside the method.
        int localVar=20;
        System.out.println("Local Variable value: " + localVar);
    }

//    @Override
//    public String toString() {
//        return "LocalVar{" +
//                "age=" + age +
//                '}';
//    }
}
class Main{
    public static void main(String[] args) {
        VarScope met= new VarScope();
        met.age=30;
//        System.out.println(met); //it refers to ToStringMethod().
        System.out.println( "Instance variable value: " +met.age);
        System.out.println("Global Variable value: " +VarScope.name);
        met.method();

        // suppose your method is static then you don't need to create an object for accessing the method
        // you just write your class name with (.) operator you can access it.
        //e.x. VarScope.Method()

    }
}

//if you have already assigned the value of Instance variable while declaring the variable e.g.
// int age =30; instead doing int age; then you don't need to use toString Method for printing the
// value of your local variable you can directly use Sout(met.age)--- met is your object name and
// using your object name you can print your value. but remember if you didnt initialize the value
// while declaring the local variable then you need to use twoString method for printing the value
// if you want to skip two string method but still want to print then
//first assign the value i.e. met.age =30; then print the object. sout(met.age).
// if you created a global variable then you don't need to create the object to access the value
// you can directly write sout(className.globalVariableName).
// remember the scope of local variable : it is only accessible with its method outside method you cant
// access it. even you cant access the local variable after creating the object but you can access
// the method of its local variable. after creating the object.
