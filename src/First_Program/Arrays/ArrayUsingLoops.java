package First_Program.Arrays;

public class ArrayUsingLoops {
    public static void main(String[] args) {
        int[] myArr = {20,30,40,50,60};
        int index=0;
        while(index<5){  //length of array 5 (This statement means index 0 < index 5) -True
            System.out.println(myArr[index]); //print myArr[index]- now it will print index 0 - i.e. "20"
            index++; //then it will increment 0+1=> index=1 and check again (index 1<index 5)
        }

    }

}

/* Another Way: --Array Traversal(Visit all elements in an array once)--here we have visited all indexes in an array.
        int[] myArr = {20,30,40,50,60};
        int index=0;
        while(index<myArr.length){ --here compiler can find the length itself of myArr.
            System.out.println(myArr[index]);
            index++;

 */