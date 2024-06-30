package Advanced_Java_April8.Exercise;

public class Emp {
    public int salary;
    String ename;

    public Emp(int salary, String ename) {
        this.salary = salary;
        this.ename = ename;
    }

    public String getEname() {
        return ename;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "salary=" + salary +
                ", ename='" + ename + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Emp e= new Emp(33,"ab");
        System.out.println(e.getSalary() +"\n"+e.ename);
        System.out.println(e.salary);
    }
}
