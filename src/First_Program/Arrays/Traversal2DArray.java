package First_Program.Arrays;

public class Traversal2DArray {
    public static void main(String[] args) {
        int[][] myArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(myArr.length);
        int i = 0; //i-represents rows of the array.
        while (i < myArr.length) { //Outer Loop
            int j = 0;
            while (j < myArr[i].length) {  //Inner Loop
                System.out.print(myArr[i][j] + " ");
                j++;
            }
            System.out.println();
            i = i + 1;
        }
    }

}
