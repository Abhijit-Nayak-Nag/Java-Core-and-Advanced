package Advanced_Java_April8.Exercise;

public class Str {
        static String toLower(String s) {
            return s.toLowerCase();
        }

        public static String str(String st){
            System.out.println(st);
            return st;
        }


//       static void toLower(String s) {
//           System.out.println(s.toLowerCase());
//
//       }

        public static void main(String[] args){
            System.out.println(toLower("ABCDE"));
//            toLower("ABCDE");

            System.out.println(str("ABHI"));
            str("JIT");
            System.out.println(str("NAYAK"));

        }
    }

