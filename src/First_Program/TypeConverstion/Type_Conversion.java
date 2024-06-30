package First_Program.TypeConverstion;

public class Type_Conversion {
    public static void main(String[] args) {
        //Automatic conversion: when small values comes to big container.
        float myFloat=5;
        System.out.println(myFloat);
        //converting float to integer and store inside an integer variable.
        int myInt=(int)5.45f;
        System.out.println(myInt);
        double d=3.4f;
        System.out.println(d);
        float dec=3;
        System.out.println(dec);
        long eBig=(long) 3.4;
        System.out.println(eBig);
        float eDec=(float)3.4;
        System.out.println(eDec);

        Integer myIntt= Integer.valueOf((int) 5.0f);
        Double aDouble= Double.valueOf(5.0f);
    }
}

/*
 suppose we have a variable called type1 and its type is Byte, and it stores the value 127.
 and we have another variable called type2 and its type is int, and it stores the value 12.
  now you can store the value of type1 inside type2 because the data type of type1 is byte and byte
  take small storage as compared to integer, so we can say that type1 = type2, now the value of type2 is
  stored inside type1 without type casting we can store but can we store the value of type1 inside type2?
  no... because byte has small memory storage and integer take more space so one way
  to solve this problem is you can type cast it from int to byte and then you can store

  byte type1= 127;
  int a= 12;
  a=b; //it's called implicit conversion.
  b=byte(a); // type casting or implicit conversion.


// is it means that you can do this conversion with anything the answer is no
you cant store a character value into a boolean value because boolean only supports true/false
where character supports all the  character and you cant do those operation.
but anything in the range of float,double, int,long -- you can do it explicitly or implicitly.


 */