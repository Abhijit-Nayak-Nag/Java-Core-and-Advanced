package First_Program.Arrays;

public class StaticArray {
    public static void main(String[] args) {
        int[] myArr=new int[5];
        myArr[0]=20;
        myArr[1]=30;
        myArr[2]=40;
        myArr[3]=50;
        myArr[4]=60;
        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);

    }
}

/* other way of creating an array when we know the value of an array:
       int[]myArr={20,30,40,50,60} ----Creating an array.
       System.out.println(myArr[0]); ---- accessing the element from the array using its index.
       System.out.println(myArr[1]);
       System.out.println(myArr[2]);
       System.out.println(myArr[3]);
       System.out.println(myArr[4]);
 */

/*
Benefits of creating the above array:
       int[]myArr={20,30,40,50,60} ----Creating an array.

       int index=2; ---index is a variable that is stored the value of 2nd index in the array(i.e. 40)
       System.out.println(myArr[0]); ---- accessing the element from the array using its index.
       System.out.println(myArr[1]);
       System.out.println(myArr[index]);
       System.out.println(myArr[3]);
       System.out.println(myArr[4]);
 */