package Advanced_Java.MultiThreading;

public class FiS {
    public static void main(String[] args) {
        FiS fiS= new FiS();
        String sS= fiS.hello(255,"1953","Abhijit");
        System.out.println(sS);
        System.out.println(fiS.hello(1901227,"353", "C.V.Raman Global University"));

    }
    public String hello(int z , String f, String e){
        System.out.println(f);
        return z +  f + " - "+ e ;

    }
}




