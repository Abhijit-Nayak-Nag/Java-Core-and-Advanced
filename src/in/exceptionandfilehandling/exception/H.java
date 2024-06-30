package in.exceptionandfilehandling.exception;

public class H {
    private int sal;

    public H(){
        sal=8;
    }

    public H(int sal) {
        this.sal=sal;
    }


    public static void main(String[] args) {
        H h= new H(77);
        System.out.println(h.sal);

        H h1= new H();
        System.out.println(h1.sal);



    }
}
