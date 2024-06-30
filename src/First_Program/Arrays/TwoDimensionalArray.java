package First_Program.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // 1'st way of initializing two-dimensional array: -
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arr.length);
        System.out.println(arr[0][0]);
    }
}
        /*System.out.println(arr[0].length); --in this array you will get the size of an array-2
           because here we made the size of rows =0 and cols left and size of cols =3, so
           we will get 3 as the size of an array.
           Array Structure : 1 2 3
                             4 5 6   - Actual size of an array =(2 X 3) but in case array
        when we create a 2-D array the only length it shows the length of your rows
        if you make your rows length = 0, then it will show you length of your cols.
    */


/*
 Alternative way to create an array:--

 int [][] myArr=new int [5][4] ----we want a array of size 5*4
myArr[0][0]=9; -- Initializing the element to the array.
 */
