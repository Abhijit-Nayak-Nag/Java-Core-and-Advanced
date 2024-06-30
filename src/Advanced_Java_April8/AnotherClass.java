package Advanced_Java_April8;


import Advanced_Java.MultiThreading.MyClass;

public class AnotherClass {

    public static void main(String[] args) {
        MyClass my =new MyClass("This is my Properties");
        System.out.println(my);
        my.setMyProperties("Mine");
        System.out.println(my.getMyProperties());


    }

}
