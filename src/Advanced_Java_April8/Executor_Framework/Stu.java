package Advanced_Java_April8.Executor_Framework;

import Advanced_Java_April8.Exercise.Emp;

public class Stu {
    public static void main(String[] args) {
        Emp emp= new Emp(3,"Ab");
        System.out.println(emp.getSalary()+"\n" +emp.getEname());
    }

}
