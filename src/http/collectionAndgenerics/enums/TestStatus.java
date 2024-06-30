package http.collectionAndgenerics.enums;

public class TestStatus {
    public static void main(String[] args) {
        Status s= Status.SUCCESS;
        System.out.println(s);

        Status s1= Status.PENDING;
        System.out.println(s1);

// it will throw an error because we can only those objects which we have mentioned in enum class.
//        Status s2= Status.HAPPY;
//        System.out.println(s2);

        System.out.println(s.ordinal());

        Status[] ss= Status.values();
        for (Status s3: ss){
            System.out.println(s3 + ":" +s3.ordinal());
        }

        System.out.println("using for-each loop\n");

        for (Status s4: Status.values()){
            System.out.println(s4 +":" +s4.ordinal());
        }
    }
}
