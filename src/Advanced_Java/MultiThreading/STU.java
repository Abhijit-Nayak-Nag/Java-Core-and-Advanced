package Advanced_Java.MultiThreading;

public class STU {
    private int age;
    static String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        STU.name = name;
    }

    public static void main(String[] args) {
        STU stu= new STU();
        stu.age=3;
        name="Abhi";
//      stu.name="jjj";
        System.out.println(name);
        System.out.println(stu.age);
        System.out.println(stu.age=33);
        int age1= stu.age=44;
        System.out.println(stu.age);
        stu.setAge(4);
        int agee= stu.getAge();
        System.out.println(stu.getAge());
        System.out.println(agee);
    }
}
