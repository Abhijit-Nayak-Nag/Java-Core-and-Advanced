package Advanced_Java_April8.Exercise;

public class IfElse {
            public static String compareNM(int n, int m) {
            if (n>m){
                return "greater";
            }else{
                return "smaller";
            }
        }


//    public static void compareNM(int n, int m) {
//        if (n > m) {
//            System.out.println("greater");
//        } else {
//            System.out.println("smaller");
//        }
//    }


    public static void main(String[] args) {
        System.out.println(compareNM(4, 8));
    }
}
//     public static void main(String[] args){
//     compareNM(4,8);
//     }
// }
