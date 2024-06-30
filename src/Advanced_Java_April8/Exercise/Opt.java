package Advanced_Java_April8.Exercise;

import java.util.Optional;

public class Opt {
    public static void main(String[] args) {
        Optional<String> emptyOptional= Optional.empty();
        Optional<String> nameOpt= Optional.of("Abhijit");


//        if(emptyOptional.isPresent()){ -- this statement is false so else block will execute.
//            System.out.println("Hi "+ nameOpt.get());
//        }

        if (nameOpt.isPresent()){
            System.out.println("HI\t" +nameOpt.get());
        }else{
            System.out.println("Hii");
        }



        System.out.println(con("Hello", "k"));

    }
    public static String con(String s1, String s2){
        System.out.println(s1+s2+s1);
        return s1+s2;
    }
}
