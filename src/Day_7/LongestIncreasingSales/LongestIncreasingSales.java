package Day_7.LongestIncreasingSales;

import java.util.ArrayList;
import java.util.Collections;

public class LongestIncreasingSales {
    public static ArrayList<Integer> findLongestIncreasingStretch(ArrayList<Integer> dailySales) {
        ArrayList<Integer> longestStretch = new ArrayList<>();
        ArrayList<Integer> currentStretch = new ArrayList<>();
        for (int i = 0; i < dailySales.size()-1; i++) {
         int currentSale = dailySales.get(i);
          int nextSale = dailySales.get(i + 1);
            if (nextSale > currentSale) {
               currentStretch.add(currentSale);
              if (i == dailySales.size() - 2) {
                   currentStretch.add(nextSale);
              }
           } else {
              currentStretch.add(currentSale);
            if (currentStretch.size() > longestStretch.size()) {
                  longestStretch = new ArrayList<>(currentStretch);
             }
             currentStretch.clear();
          }
      }
        return longestStretch;
   }
    public static void main (String[]args){
            LongestIncreasingSales analyzer = new LongestIncreasingSales();
            ArrayList<Integer> dailySales = new ArrayList<>();
            dailySales = new ArrayList<>();
            dailySales.add(100);
            dailySales.add(200);
            dailySales.add(300);
            dailySales.add(150);
            dailySales.add(250);
            dailySales.add(350);
            dailySales.add(400);
            dailySales.add(500);
            dailySales.add(200);
            dailySales.add(300);
            dailySales.add(400);
            dailySales.add(500);
            dailySales.add(600);
            ArrayList<Integer> longestStretch = findLongestIncreasingStretch(dailySales);
            System.out.println("Longest increasing stretch :" + longestStretch);
        }
    }
