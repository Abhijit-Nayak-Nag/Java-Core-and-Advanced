package First_Program.Arrays;

import java.util.ArrayList;

public class TraversingArrayList {
//    public static void main(String[] args) {
//        ArrayList<String> list= new ArrayList<String>();
//        list.add("Java");
//        list.add("Python");
//        list.add("C");
//        list.add("C++");
//        list.add("Ruby");
//        System.out.println("Traversing ArrayList using a for loop: ");
//        for(int i=0; i< list.size(); i++ ){
//            System.out.println(list.get(i));
//        }
//
//    }
     public static void main(String[] args) {
          ArrayList<String> arrList = new ArrayList<String>();
          arrList.add("Java");
          arrList.add("Python");
          arrList.add("C");
          arrList.add("C++");
          arrList.add("Ruby");
          System.out.println("Traversing ArrayList using a While loop: ");

          int j = 0;
          while (j < arrList.size()) {
              System.out.println(arrList.get(j));
              j++;
          }

     }
}
