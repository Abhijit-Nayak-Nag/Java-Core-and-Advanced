package functional.programming.stream;

public class II {
    private static String name ;
    public static void ni(){
        System.out.println(name);
    }
    public static int agee(int age){
        System.out.println(age);
        return age;
    }

    public static void main(String[] args) {
        II.name="kk";
        System.out.println(name);
        II.ni();
        ni();
       int a= agee(34);
       System.out.println(a);
       agee(22);
       System.out.println("your age is: " +agee(34));
       System.out.println(agee(33));
    }

}
