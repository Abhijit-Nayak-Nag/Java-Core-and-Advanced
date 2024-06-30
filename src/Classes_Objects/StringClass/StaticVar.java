package Classes_Objects.StringClass;


public class StaticVar {
    static int price;
    private int salary;

    public static void main(String[] args) {
        StaticVar s= new StaticVar();
        s.salary=2222;
        System.out.println(s.salary);
        StaticVar.price=000;
        System.out.println(price);
        int n=33;
        System.out.println(n);
        int price= 222;
        System.out.println(price);

    }

}
