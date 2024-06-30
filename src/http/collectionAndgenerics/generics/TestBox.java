package http.collectionAndgenerics.generics;

public class TestBox {
    public static void main(String[] args) {
        Box<Integer> box= new Box<>(121);
        System.out.println(box.getContainer());
        box.container=131;
        System.out.println(box.getContainer());

        Box<String> box1= new Box<>("Abhi");
        box1.container= "Nayak";
        System.out.println(box1.getContainer());
        System.out.println(box.container);



        Box<Character>box2= new Box<>('d');
        System.out.println(box2.getContainer());
        System.out.println(box2.container);
        box2.container='e';
        System.out.println(box2.container);


        Box boxx= new Box("ddddd");
        System.out.println(boxx.getContainer());

        Box boxx1= new Box(345555);
        System.out.println(boxx1.getContainer());
        boxx1.container=44444;
        System.out.println(boxx1.getContainer());

    }
}
