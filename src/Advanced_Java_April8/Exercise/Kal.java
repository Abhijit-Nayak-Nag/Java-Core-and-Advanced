package Advanced_Java_April8.Exercise;

public class Kal {
    private int sno;

//    public int getSno() {
//        return sno;
//    }
//
//    public void setSno(int sno) {
//        this.sno = sno;
//    }
        public Kal(int sno) {
        this.sno=sno;
    }

    public Kal() {
            sno=5;
    }

    @Override
    public String toString() {
        return "Kal{" +
                "sno=" + sno +
                '}';
    }
    public static void hello(){
        System.out.println("hello");
    }
}
