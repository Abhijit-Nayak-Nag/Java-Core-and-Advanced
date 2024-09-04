package Advanced_Java.MultiThreading;

public class St {
    private int age;
    private String name;

    int salary;

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public St(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
    public St(){

    }

    @Override
    public String toString() {
        return "St{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        St st= new St();
        System.out.println(st.heyMethod("Abhi"));

        String ss= st.heyMethod("Abhi");
        System.out.println(ss);
        st.heyMethod("Jeevan");

        hello("Satya");
//        St.hello("Rahul");

    }
    public String heyMethod(String str){
        String res= "hello";
        System.out.println(res + " " +  str );
//        return "Hello " +str;
        return res +" "+ str;

    }

    public static void hello(String str){
        System.out.println("Hello " + str);
        String sr= "Hello";
        System.out.println(sr + " "+ str);
    }

   public void agee(){
       System.out.println("Age: " + age);
       System.out.println("Name: " + name);
       System.out.println("Salary: " + salary);
   }
}
