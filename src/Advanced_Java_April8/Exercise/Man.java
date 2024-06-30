package Advanced_Java_April8.Exercise;

public class Man {
    String name;
    char sex;
    int money;
    int weight;
    double size;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Man(String name, char sex, int money, int weight, double size) {
        this.name = name;
        this.sex = sex;
        this.money = money;
        this.weight = weight;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", money=" + money +
                ", weight=" + weight +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Man man = new Man("Abhi", 'M',200000,40,43.3);
        System.out.println(man);


        Man man1 = new Man("Abhi", 'M',200000,40,43.3);
        System.out.println(man1);


        man1.setName("Adi");
        System.out.println( man1 + "name: "+man.getName());

        System.out.println(man1);
        System.out.println(man);
    }

}
