package Advanced_Java.MultiThreading;

public class Fizz {
    public static void main(String[] args) {
        Fizz f= new Fizz();
        System.out.println(f.i_play(8));
        String s= f.i_play(9);
        System.out.println(s);

    }


    public String i_play(int n){
        String result= "Fizz";
        System.out.println(result);
        return result;
    }
}
